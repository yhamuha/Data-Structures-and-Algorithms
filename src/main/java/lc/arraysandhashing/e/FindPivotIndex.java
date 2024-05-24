package lc.arraysandhashing.e;

public class FindPivotIndex {
    // O(n) O(n)
    static public int pivotIndex(int[] nums) {
        if (nums.length == 0) return -1;
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < sums.length; i++) {     // build prefix array
            sums[i] = sums[i - 1] + nums[i];
        }
        for (int i = 0; i < sums.length; i++) {
            int left = i == 0 ? 0 : sums[i - 1];
            int right = sums[sums.length - 1] - sums[i];
            if (left == right) return i;
        }
        return -1;
    }
    // O(n) O(1)
    static public int pivotIndexEnhanced(int[] nums) {
        int total = 0;      // define total
        for (int n: nums) {
            total += n;
        }
        int leftSum = 0;
        for (int i=0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];
            if (leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        // System.out.println(pivotIndex(arr));
        System.out.println(pivotIndexEnhanced(arr));
    }
}
