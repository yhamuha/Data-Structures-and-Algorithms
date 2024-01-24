package lc.dp.m;

public class MaximumProductSubarray {
    // O(n) O(1)
    int maxProduct(int[] nums) {
        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int ans = nums[0];
        for (int i = 0; i < n; i++) {
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;
            leftProduct *= nums[i];
            rightProduct *= nums[n - 1 - i];
            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }
        return ans;
    }

    public static void main(String[] args) {
        var mps = new MaximumProductSubarray();
        int[] nums = {2,3,-2,4};
        System.out.println(mps.maxProduct(nums));
    }
}
