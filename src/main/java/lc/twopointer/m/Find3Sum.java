package lc.twopointer.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find3Sum {
    // O(n^2) O(n) #ibm #walmart
    static List<List<Integer>> findThreeSum(int[] nums) {
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
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(findThreeSum(nums));
    }
}
