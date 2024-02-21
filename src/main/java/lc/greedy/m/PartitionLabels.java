package lc.greedy.m;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    // O(n) O(n)
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        int end = 0;
        int [] lastIndex = new int [26];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++){
            lastIndex [s.charAt(i) - 'a'] = i;
        }
        int prev = 0;
        for (int j = 0; j < n; j++){
            end = Math.max(end, lastIndex[s.charAt(j) - 'a']);
            if (end == j) {
                ans.add(end + 1- prev);
                prev = j + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        var pl = new PartitionLabels();
        String s = "ababcbacadefegdehijhklij";
        System.out.println(pl.partitionLabels(s));
    }
}
