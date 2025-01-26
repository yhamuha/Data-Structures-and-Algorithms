package lc.binarysearch.m;

import java.util.Arrays;

public class FrequencyOfTheMostFrequentElement {
    // O(n log n) O(1)
    public int maxFrequency(int[] nums, int k) {
        int maxFrequency = 0;
        long currentSum = 0;
        Arrays.sort(nums);
        for (int left = 0, right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            while (currentSum + k < (long) nums[right] * (right - left + 1)) {
                currentSum -= nums[left];
                left++;
            }
            maxFrequency = Math.max(maxFrequency, right - left + 1);
        }
        return maxFrequency;
    }

    public static void main(String[] args) {
        FrequencyOfTheMostFrequentElement solution = new FrequencyOfTheMostFrequentElement();
        int[] nums = {1, 2, 4};
        int k = 5;
        int result = solution.maxFrequency(nums, k);
        System.out.println(result);
    }
}

