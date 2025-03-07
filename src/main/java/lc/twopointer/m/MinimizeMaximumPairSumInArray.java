package lc.twopointer.m;

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray {
    // O(n log n) O(1)
    static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0, j=nums.length-1;
        int max = Integer.MIN_VALUE;
        while(i<j){
            max = Math.max(nums[i]+nums[j],max);
            i++;
            j--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,2,3};
        System.out.println(minPairSum(nums));
    }
}
