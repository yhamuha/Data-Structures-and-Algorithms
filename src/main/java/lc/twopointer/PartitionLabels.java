package lc.twopointer;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        if (s == null || s.length() == 0) return null;
        List<Integer> output_arr = new ArrayList();

        // create an array with lastIndexes for each of characters
        int[] lastIndices = new int[26];
        for (int i = 0; i<s.length(); i++) {
            lastIndices[s.charAt(i)-'a'] = i;
        }

        int start = 0;
        int end = 0;
        for (int i=0; i<s.length(); i++) {
            end = Math.max(end, lastIndices[s.charAt(i)-'a']);
            if (i == end) {
                output_arr.add(end-start+1);
                start = end+1;
            }
        }
        return output_arr;
    }

    public static void main(String[] args) {
        PartitionLabels pl = new PartitionLabels();
        String s = "ababcbacadefegdehijhklij";
        System.out.println(pl.partitionLabels(s));
    }

}
