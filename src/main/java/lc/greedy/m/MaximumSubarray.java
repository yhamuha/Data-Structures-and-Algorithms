package lc.greedy.m;

public class MaximumSubarray {
    // O(n) O(1)
    public int maxSubArray(int[] nums) {
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int num: nums){
            sum += num;
            max = Math.max(max, sum);
            if(sum <0)
                sum =0;
        }
        return max;
    }

    public static void main(String[] args) {
        var ms = new MaximumSubarray();
        int[] nums = {1,2,-2,1,2};
        System.out.println(ms.maxSubArray(nums));
    }
}
