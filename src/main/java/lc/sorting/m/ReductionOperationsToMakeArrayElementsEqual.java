package lc.sorting.m;

import java.util.Arrays;

public class ReductionOperationsToMakeArrayElementsEqual {
    // O(n log n) O(1)
    static int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int up = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1])
                up++;
            ans += up;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5, 1, 3};
        System.out.println(reductionOperations(nums));
    }
}
