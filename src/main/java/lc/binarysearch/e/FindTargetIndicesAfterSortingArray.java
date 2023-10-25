package lc.binarysearch.e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    // O(log n + k) O(n)
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int left = findFirst(nums, target);
        int right = findLast(nums, target);
        if (left == -1 || right == -1) {
            return new ArrayList<Integer>();
        }
        List<Integer> targetIndices = new ArrayList<Integer>();  // initialize an empty list
        for (int i = left; i <= right; i++) {
            if (nums[i] == target) {
                targetIndices.add(i);
            }
        }
        return targetIndices;
    }

    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (left < nums.length && nums[left] == target) ? left : -1;
    }

    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (right >= 0 && nums[right] == target) ? right : -1;
    }

    public static void main(String[] args) {
        FindTargetIndicesAfterSortingArray ft = new FindTargetIndicesAfterSortingArray();
        int[] nums = {1,2,5,2,3};
        System.out.println(ft.targetIndices(nums, 2));
    }
}
