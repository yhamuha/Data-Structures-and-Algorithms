package lc.greedy.m;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    // O(n) O(1)
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        int end = 0;
        List<Integer> answer = new ArrayList<>();
        int[] lastIndex = new int[26];
        for(int i=0; i<n;i++)
            lastIndex[s.charAt(i)-'a'] = i;
        int prev = 0;
        for(int j=0; j< n; j++) {
            end = Math.max(end, lastIndex[s.charAt(j) - 'a']);
            if (end == j) {
                answer.add(end + 1 - prev);
                prev = j + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        var pl = new PartitionLabels();
        String s = "ababcbacadefegdehijhklij";
        System.out.println(pl.partitionLabels(s));
    }
}
