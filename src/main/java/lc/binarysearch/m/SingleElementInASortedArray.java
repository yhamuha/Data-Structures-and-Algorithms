package lc.binarysearch.m;

public class SingleElementInASortedArray {
    // O(log n) O(1)
    static int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1)
                mid--;
            if (nums[mid] != nums[mid + 1])
                right = mid;
              else
                left = mid + 2;
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 5, 5};
        System.out.println(singleNonDuplicate(nums));
    }
}



