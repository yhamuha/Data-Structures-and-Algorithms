package lc.arraysandhashing.m;

import java.util.Arrays;
import java.util.HashMap;

public class SingleNumberIII {
    // O(n) O(1)
    static int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int[] result = new int[2];
        int m = nums.length;
        for (int i = 0; i < m; i++)
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        int index = 0;
        for (int i = 0; i < m; i++) {
            if (freqMap.get(nums[i]) == 1)
                result[index++] = nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
}
