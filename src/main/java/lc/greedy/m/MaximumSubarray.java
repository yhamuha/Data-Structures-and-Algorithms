package lc.greedy.m;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for(int num: nums){
            sum = sum + num;
            maxValue = Math.max(maxValue,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        var ms = new MaximumSubarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ms.maxSubArray(nums));
    }
}
