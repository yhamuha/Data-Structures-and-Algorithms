package lc.arraysandhashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // O(n^2)
    static public int[] findTwoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                int num2 = nums[j];
                int sum = num1 + num2;
                if(sum == target) {
                    return new int[] {i , j };
                }
            }
        }
        return null;
    }

    // O(n)
    static public int[] findTwoSumImproved(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        } return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,5,6,2,7};
        System.out.println(Arrays.toString(findTwoSum(arr, 3)));

        System.out.println(Arrays.toString(findTwoSumImproved(arr, 3)));
    }
}
