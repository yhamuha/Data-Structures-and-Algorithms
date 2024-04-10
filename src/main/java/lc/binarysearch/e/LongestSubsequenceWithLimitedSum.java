package lc.binarysearch.e;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
    // T: O( sort: log n + prefix: log n)
    // S: O(ans + prefix)
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] ans = new int[queries.length];
        int[] prefix = new int[n+1];

        for (int i=1; i<prefix.length; i++) {       // create prefix array
            prefix[i] = prefix[i-1] + nums[i-1];
        }

        for (int i=0; i<queries.length; i++) {      // check index for each query
            int val = queries[i];
            ans[i] = bS(val, prefix);
            }
        return ans;
    }

    private int bS(int val, int[] prefix) {         // bs helper func
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
        var lcs = new LongestSubsequenceWithLimitedSum();
        System.out.println(Arrays.toString(lcs.answerQueries(new int[]{4,5,2,1}, new int[]{3,10,21})));
    }
}
