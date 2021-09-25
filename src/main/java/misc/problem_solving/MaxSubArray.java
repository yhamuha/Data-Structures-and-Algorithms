package misc.problem_solving;

/**
 *
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {1,2,-5,3,6};
        System.out.println(maxSubArray(nums));
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
}
