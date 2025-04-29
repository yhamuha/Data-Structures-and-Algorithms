package lc.binarysearch.m;

import java.util.TreeSet;

public class PlatesBetweenCandles {
    // O(n + q log n) O(n)
    static int[] platesBetweenCandles(String s, int[][] queries) {
        TreeSet<Integer> candles = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '|')
                candles.add(i);
        }
        int[] prefixSum = new int[s.length()];
        prefixSum[0] = (s.charAt(0) == '*') ? 1 : 0;
        for(int i = 1;i < s.length(); i++)
            prefixSum[i] = prefixSum[i - 1] + ((s.charAt(i) == '*') ? 1 : 0);
        int[] ans = new int[queries.length];
        int i = 0;
        for(int[] query : queries) {
            Integer left = candles.ceiling(query[0]);
            Integer right = candles.floor(query[1]);
            if(left == null || right == null || left >= right || left > query[1] || right < query[0]) {
                ans[i++] = 0;
                continue;
            }
            ans[i++] = prefixSum[right] - prefixSum[left];
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "**|**|***|";
        int[][] queries = { {2, 5}, {0, 8}, {2, 6} };
        int[] result = platesBetweenCandles(s, queries);
        for (int count : result)
            System.out.print(count);
    }
}
