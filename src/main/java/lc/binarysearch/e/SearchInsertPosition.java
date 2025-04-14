package lc.binarysearch.e;

public class SearchInsertPosition {
    // O(log n) O(1)
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        int midValue;
        while (start <= end) {
            mid = start + (end-start)/2;
            midValue = nums[mid];
            if (midValue < target) {
                start = mid + 1;
            } else if (midValue > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(searchInsert(nums, target));

    }
}
