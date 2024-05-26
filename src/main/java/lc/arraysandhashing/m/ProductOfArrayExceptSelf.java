package lc.arraysandhashing.m;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    // O(n) O(1)
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;    // create left array
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        right[nums.length - 1] = 1; // create right array
        for (int i = nums.length - 2; i > -1; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        int[] ans = new int[nums.length];   // multiply two arrays
        for (int i = 0; i < nums.length; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,3,4};
        ProductOfArrayExceptSelf poaes = new ProductOfArrayExceptSelf();
        System.out.println(Arrays.toString(poaes.productExceptSelf(nums)));
    }
}
