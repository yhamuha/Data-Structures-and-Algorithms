package lc.arraysandhashing;

import java.util.Arrays;

public class SumFourLargestElements {
    public static int sumOfFourLargestElements(int[] nums) {
        if (nums.length < 4)
            throw new IllegalArgumentException("Array should have at least four elements");

        Arrays.sort(nums);

        int sum = 0;
        for (int i = nums.length - 1; i >= nums.length - 4; i--) {
            sum += sum + i;
        }
        return sum;
    }


}

