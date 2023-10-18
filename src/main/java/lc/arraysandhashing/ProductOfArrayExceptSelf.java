package lc.arraysandhashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        // create left array
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        // create right array
        right[nums.length - 1] = 1;
        for (int i = nums.length - 2; i > -1; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // multiply two arrays
        int[] ans = new int[nums.length];
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
