package lc.greedy.m;

public class MaximumSubarray {
    // O(n) O(1) #amazon
    static int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int currSum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            max = Math.max(max, currSum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}
