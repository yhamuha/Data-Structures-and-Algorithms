package lc.dp.m;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int N = nums.length;
        // SC: O(n)
        int[] cache = new int[N];

        cache[N - 1] = 1;
        int maxLIS = 1;
        // TC: O(n^2)
        for(int i = N - 2; i >= 0; i--){
            int maxLISForRemainingElements = 0;
            int curVal = nums[i];
            for(int j = i + 1; j < N; j++){
                if(curVal < nums[j]){
                    maxLISForRemainingElements = Math.max(maxLISForRemainingElements, cache[j]);
                }
            }
            // Memoization
            cache[i] = maxLISForRemainingElements + 1;
            maxLIS = Math.max(maxLIS, cache[i]);
        }

        return maxLIS;
    }

    public static void main(String[] args) {
        var lis = new LongestIncreasingSubsequence();
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lis.lengthOfLIS(nums));
    }
}
