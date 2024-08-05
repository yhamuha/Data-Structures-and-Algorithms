package lc.slidingwindow.h;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    // O(n) O(n)
    public String minWindow(String s, String t) {
        if(s.length() < t.length())
            return "";
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            map.merge(c,1,Integer::sum);
        }
        int count=0, start=0, min_length = Integer.MAX_VALUE, min_start = 0;
        for(int end=0; end<s.length(); end++){
            if(map.containsKey(s.charAt(end))){
                if(map.get(s.charAt(end))>0)
                    count+=1;
                map.put(s.charAt(end), map.get(s.charAt(end))-1);
            }
            if(count == t.length()) {
                while(start < end && (!map.containsKey(s.charAt(start)) || map.get(s.charAt(start)) < 0)){
                    if(map.containsKey(s.charAt(start)))
                        map.put(s.charAt(start), map.get(s.charAt(start))+1);
                    start+=1;
                }
                if(min_length > end-start+1)
                    min_length = end-(min_start=start)+1;
                if(map.containsKey(s.charAt(start)))
                    map.put(s.charAt(start), map.get(s.charAt(start))+1);
                count-=1;
                start+=1;
            }
        }
        return min_length == Integer.MAX_VALUE ? "" : s.substring(min_start, min_start+min_length);
    }

    public static void main(String[] args) {
        var mws = new MinimumWindowSubstring();
        System.out.println(mws.minWindow(new String("ADOBECODEBANC"),new String("ABC")));
    }
}
