package lc.twopointer.e;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // O(n) O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if (map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println("Indices of the two numbers that add up to the target:");
        System.out.println(Arrays.toString(result));
    }
}
