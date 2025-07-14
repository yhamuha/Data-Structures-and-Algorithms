package lc.arraysandhashing.m;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    // O(n) O(n)
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK obj = new SubarraySumEqualsK();
        int[] nums = {1, 2, 3, 1, 2, 3, 3};
        int k = 3;
        System.out.println(obj.subarraySum(nums, k));
    }
}
