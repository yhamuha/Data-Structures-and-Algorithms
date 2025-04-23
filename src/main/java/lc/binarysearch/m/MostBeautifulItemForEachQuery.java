package lc.binarysearch.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MostBeautifulItemForEachQuery {
    // O(n log n + m*n) O(n+m)
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int maxI = Integer.MAX_VALUE;
        List<int[]> res = new ArrayList<>();
        res.add(new int[] {0, 0, maxI});
        Arrays.sort(items, Comparator.comparingInt(a -> a[0]));
        for (int[] item : items) {
            int price = item[0];
            int beauty = item[1];
            int[] lastBracket = res.get(res.size() - 1);
            if (beauty > lastBracket[1]) {
                lastBracket[2] = price;
                res.add(new int[] {price, beauty, maxI});
            }
        }
        int[] ans = new int[queries.length];
        for (int j = 0; j < queries.length; j++) {
            int x = queries[j];
            for (int i = res.size() - 1; i >= 0; i--) {
                if (res.get(i)[0] <= x) {
                    ans[j] = res.get(i)[1];
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        MostBeautifulItemForEachQuery solution = new MostBeautifulItemForEachQuery();
        int[][] items = {{1, 4}, {2, 5}, {3, 2}, {4, 6}};
        int[] queries = {1, 2, 3, 4, 5};
        int[] results = solution.maximumBeauty(items, queries);
        System.out.println(Arrays.toString(results));
    }
}
