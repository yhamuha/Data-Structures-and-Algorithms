package lc.twopointer.m;

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int max = Integer.MIN_VALUE;
        while(i<j){
            max = Math.max(nums[i]+nums[j],max);
            i++;j--;
        }
        return max;
    }

    public static void main(String[] args) {
        MinimizeMaximumPairSumInArray mmp = new MinimizeMaximumPairSumInArray();
        int[] nums = {3,5,4,2,4,6};
        System.out.println(mmp.minPairSum(nums));
    }
}
