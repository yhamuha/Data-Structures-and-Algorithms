package lc.binarysearch.e;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
    // O(n log n) O(n)
    static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] ans = new int[queries.length];
        int[] prefix = new int[n+1];
        for (int i=1; i<prefix.length; i++)
            prefix[i] = prefix[i-1] + nums[i-1];
        for (int i=0; i<queries.length; i++) {
            int val = queries[i];
            ans[i] = binarySearch(val, prefix);
            }
        return ans;
    }
    static private int binarySearch(int val, int[] prefix) {
        int left = 0;
        int right = prefix.length - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (prefix[mid] == val) return mid;
            else if (prefix[mid] < val)
                left = mid + 1;
            else right = mid - 1;
        }
        if (val > prefix[right]) return right;
        return left;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(answerQueries(
                new int[]{4,5,2,1},
                new int[]{3,10,21})));
    }
}
