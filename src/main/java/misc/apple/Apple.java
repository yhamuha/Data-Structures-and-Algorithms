package misc.apple;

import java.util.Arrays;

/**
 *
 */
public class Apple {

    // find single number using XOR
    /*public static int singleNumber(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }*/

    // isDuplicate in ordered array
    // Arrays.sort using quick sort with O(log n) time complexity
    /*public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }*/

    // missing number through XOR
    /*public static int missingNumber(int[] nums) {
        int missingNum = nums.length;
        for(int i =0; i< nums.length; i++) {
            missingNum = missingNum ^ i ^ nums[i];
        }
        return missingNum;
    }*/

    public static void main(String[] args) {
        int[] nums = {0,1,3};
        System.out.println(missingNumber(nums));
    }
}
