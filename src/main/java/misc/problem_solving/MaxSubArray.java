package misc.problem_solving;

/**
 *
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {1,2,-5,3,6};
//        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray2(nums));
    }
    //O(n^2)
    static int maxSubArray(int[] nums) {
        int maxSubarray = Integer.MIN_VALUE;    // to level variable to collect max value
        for (int i = 0; i < nums.length; i++) {
            int currentSubarray = 0;
            for (int j = i; j < nums.length; j++) {
                currentSubarray += nums[j];
                maxSubarray = Math.max(maxSubarray, currentSubarray);
            }
        }
        return maxSubarray;
    }
    // Kadane's Algorithm
    // t: O(n)
    // s: O(1)
    static int maxSubArray2(int[] nums) {
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            currentSubarray = Math.max(num, currentSubarray + num);
            maxSubarray = Math.max(maxSubarray, currentSubarray);
        }

        return maxSubarray;
    }
}
