package lc.arrays;

public class PivotIndex {

    // time: O(n+m) -> O(n)
    // space: O(n)
    static public int pivotIndex(int[] nums) {
        if (nums.length == 0) return -1;

        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        // build prefix array
        for (int i = 1; i < sums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }

        for (int i = 0; i < sums.length; i++) {
            int left = i == 0 ? 0 : sums[i - 1];
            int right = sums[sums.length - 1] - sums[i];

            if (left == right) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-7,1,5,2,-4,3,0};
        System.out.println(pivotIndex(arr));
    }
}
