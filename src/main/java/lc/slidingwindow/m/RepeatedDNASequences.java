package lc.slidingwindow.m;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences {
    // O(n) O(n)
    static List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> ans = new HashSet<>();
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while(j<s.length()){
            sb.append(s.charAt(j));
            if(j-i+1 < 10){
                j++;
            } else {
                if(set.contains(sb.toString())){
                    ans.add(sb.toString());
                } else {
                    set.add(sb.toString());
                }
                sb.delete(0,1);
                i++;
                j++;
            }
        }
        List<String> res = new ArrayList<>(ans);
        return res;
    }

    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(s));
    }
}
