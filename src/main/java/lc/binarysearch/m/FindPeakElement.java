package lc.binarysearch.m;

public class FindPeakElement {
    // O(log n) O(1)
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else
                left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        FindPeakElement peakFinder = new FindPeakElement();
        int[] nums = {1, 2, 3, 1};
        int peakIndex = peakFinder.findPeakElement(nums);
        System.out.println("Peak Element Index: " + peakIndex);
    }
}
