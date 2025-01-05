package lc.sorting.e;

import java.util.Arrays;

public class LongestHarmoniousSubsequence {
    // O(n log n) O(1)
    public int findLHS(int[] nums) {
        int i=0;
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        if (nums[0]==nums[nums.length-1])
            return 0;
        int min1=0, max1=0;
        int lhs=Integer.MIN_VALUE;
        while (i<nums.length) {
            if (min>nums[i]) {
                min1=i; min=nums[i];
            }
            if (max<=nums[i]) {
                max1=i; max=nums[i];
            }
            if ((max-min)>1) {
                min1++; min=nums[min1];
            }
            else if ((max-min)<1)
                i++;
            else {
                lhs=Math.max(lhs,(max1-min1)+1);
                i++;
            }
        }
        return lhs < 0 ? 0 : lhs;
    }

    public static void main(String[] args) {
        LongestHarmoniousSubsequence solution = new LongestHarmoniousSubsequence();
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println(solution.findLHS(nums));
    }
}
