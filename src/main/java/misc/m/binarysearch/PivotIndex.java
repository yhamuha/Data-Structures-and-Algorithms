package misc.m.binarysearch;

public class PivotIndex {
    // O(n) O(n)
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) return -1;
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < sums.length; i++)
            sums[i] = sums[i - 1] + nums[i];
        for (int i = 0; i < sums.length; i++) {
            int left = i == 0 ? 0 : sums[i - 1];
            int right = sums[sums.length - 1] - sums[i];
            if (left == right) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        PivotIndex solution = new PivotIndex();
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println(solution.pivotIndex(nums1));
    }
}
