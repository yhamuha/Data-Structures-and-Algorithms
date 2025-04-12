package lc.binarysearch.e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    // O(log n) O(n)
    static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int left = leftPosition(nums, target);
        int right = rightPosition(nums, target);
        if (left == -1 || right == -1)
            return new ArrayList<>();
        List<Integer> indices = new ArrayList<>();
        for (int i=left; i<=right; i++){
            if (nums[i] == target)
                indices.add(i);
        }
        return indices;
    }
    static private int leftPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] < target)
                left = mid + 1;
            else right = mid - 1;
        }
        return (left < nums.length) && (nums[left] == target) ? left : -1;
    }
    static private int rightPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] <= target)
                left = mid + 1;
            else right = mid - 1;
        }
        return (right >= 0) && (nums[right] == target) ? right : -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        System.out.println(targetIndices(nums, 3));
    }
}
