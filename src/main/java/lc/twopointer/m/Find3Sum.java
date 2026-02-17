package lc.twopointer.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find3Sum {
    // O(n^2) O(aux: log n; worst n^2) #ibm #walmart
    /*static List<List<Integer>> findThreeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        int n = nums.length;
        int k = n - 1;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    resultList.add(temp);
                    j++;
                    k--;
                    while (k > j && nums[k] == nums[k + 1]) k--;
                    while (k > j && nums[j] == nums[j - 1]) j++;
                }
            }
        }
        return resultList;
    }*/
    public static List<List<Integer>> findThreeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];
                if (total < 0)
                    left++;
                else if (total > 0)
                    right--;
                else
                    result.add(Arrays.asList(nums[i] + nums[left] + nums[right]));
                while (left < right && nums[right] == nums[left + 1])
                    left++;
                while (left < right && nums[right] == nums[right - 1])
                    right--;
                left++;
                right--;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(findThreeSum(nums));
    }
}
