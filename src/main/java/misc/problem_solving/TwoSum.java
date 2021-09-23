package misc.problem_solving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,3,2,1};
        System.out.println(Arrays.toString(twoSum(nums, 11)));
    }
    // c:O(n); s:O(n);
    // based on "sum of two" substraction logic
    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
