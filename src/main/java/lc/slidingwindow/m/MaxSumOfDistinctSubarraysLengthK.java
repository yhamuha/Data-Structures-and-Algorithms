package lc.slidingwindow.m;

import java.util.HashMap;

public class MaxSumOfDistinctSubarraysLengthK {
    public static long maxSum(int[] nums, int k) {
        long maxSum = 0;
        int start = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        long currentSum = 0;

        for (int end = 0; end < nums.length; end++) {
            currentSum += nums[end];
            freqMap.put(nums[end], freqMap.getOrDefault(nums[end], 0) + 1);

            if (end - start + 1 == k) {
                if (freqMap.size() == k)
                    maxSum = Math.max(maxSum, currentSum);

                currentSum -= nums[start];
                freqMap.put(nums[start], freqMap.get(nums[start]) - 1);
                if (freqMap.get(nums[start]) == 0)
                    freqMap.remove(nums[start]);
                start++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 6, 7, 7, -1};
        int k = 4;
        System.out.println(maxSum(nums, k));
    }
}



