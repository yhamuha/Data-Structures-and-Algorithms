package lc.arraysandhashing;

public class BinarySearchFirstOne {

    static public int binarySearchFirstOne(int[] nums, int target) {
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
        int[] arr = {0,1,1,1,1,1,1,1,1};
        System.out.println(binarySearchFirstOne(arr, 1));
    }
}
