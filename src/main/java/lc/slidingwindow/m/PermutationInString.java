package lc.slidingwindow.m;

import java.util.HashMap;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s1.length();i++){
            char c = s1.charAt(i);
            int val = map.getOrDefault(c,0);
            map.put(c,val+1);
        }
        HashMap<Character,Integer> originalMap = new HashMap<>();
        originalMap.putAll(map);
        int i =0, j=0;
        int count = map.size(), totalCount = s1.length();
        while(j<s2.length()){
            char c = s2.charAt(j);
            if(map.containsKey(c)){
                int val = map.get(c);
                map.put(c,val-1);
                totalCount-=1;
                if(val==1){
                    count-=1;
                    map.remove(c);
                }
                if(totalCount==0)
                    return true;
                j+=1;
            }else if(!map.containsKey(c) && totalCount<s1.length()){
                map.putAll(originalMap);
                totalCount = s1.length();
                i+=1;
                j=i;
            }else
                j+=1;
        }
        return false;
    }

    public static void main(String[] args) {
        var ps = new PermutationInString();
        System.out.println(ps.checkInclusion(new String("ab"), new String("eidbaooo")));
    }
}
