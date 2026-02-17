package lc.twopointer.m;

import java.util.Arrays;

public class TwoSum {
    // O(n) O(1)
    public static Boolean twoSum(int[] nums, Integer target) {
        int left = 0, right = nums.length - 1;
        int currentMax = 0;

        while (left < right) {
            int total = nums[left] + nums[right];
            if (total == target)
                return true;

            if (total < target)
                left++;
            else
                right--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums, target));
    }
}
