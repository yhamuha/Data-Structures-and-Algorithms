package lc.arraysandhashing.m;

import java.util.HashMap;

public class SingleNumberII {
    // O(n) O(n)
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int m = nums.length;
        for (int i = 0; i < m; i++)
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        for (int i = 0; i < m; i++) {
            if (freqMap.get(nums[i]) == 1)
                return nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        SingleNumberII sn = new SingleNumberII();
        int[] nums = {2, 2, 3, 2};
        int result = sn.singleNumber(nums);
        System.out.println(result);
    }
}
