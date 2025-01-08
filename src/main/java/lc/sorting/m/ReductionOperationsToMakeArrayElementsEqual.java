package lc.sorting.m;

import java.util.Arrays;

public class ReductionOperationsToMakeArrayElementsEqual {
    // O(n log n) O(1)
    public static int reductionOperations(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int operations = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1])
                operations += n - 1 - i;
        }
        return operations;
    }

    public static void main(String[] args) {
        int[] nums = {5, 1, 3};
        System.out.println(reductionOperations(nums));
    }
}
