package misc.m.binarysearch;

public class BinarySearchLeft {
    // O(log n) O(1)
    public int binarySearchLeft(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > target) {
                hi = mid - 1;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                if (mid == 0 || nums[mid - 1] < target) return mid;
                hi = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchLeft solution = new BinarySearchLeft();
        int[] nums1 = {1, 2, 2, 2, 3, 4, 5};
        System.out.println(solution.binarySearchLeft(nums1, 2));
    }
}
