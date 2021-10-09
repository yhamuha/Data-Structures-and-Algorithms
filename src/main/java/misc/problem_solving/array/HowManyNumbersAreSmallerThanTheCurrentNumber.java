package misc.problem_solving.array;

import java.util.Arrays;

/**
 *
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    // how small each number relative the minimal one
    static int[] smallerNumbersThanCurrent(int[] nums) {
        // looking min element
        int min = nums[0];
        int minIdx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIdx = i;
            }
        }

        int[] res = new int[nums.length];
        // compare each elem of array against min value
        for (int i = 0; i< nums.length; i++) {
            res[i] = nums[i] - nums[minIdx];
        }

        return res;
    }
}
