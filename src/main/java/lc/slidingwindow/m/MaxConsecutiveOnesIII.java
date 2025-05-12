package lc.slidingwindow.m;

import java.util.ArrayList;
import java.util.List;

public class MaxConsecutiveOnesIII {
    // O(n) O(n)
    static int longestOnes(int[] nums, int k) {
        if (k != 0) {
            int left = 0, right = 0, maxLen = 0;
            List<Integer> index = new ArrayList<>();
            while (right < nums.length) {
                if (nums[right] == 1) {
                    maxLen = Math.max(maxLen, right - left + 1);
                    right++;
                } else if (nums[right] == 0 && k > 0) {
                    index.add(right);
                    k--;
                    maxLen = Math.max(maxLen, right - left + 1);
                    right++;
                } else if (nums[right] == 0 && k == 0) {
                    left = index.get(0) + 1;
                    index.remove(0);
                    k++;
                }
            }
            return maxLen;
        } else {
            int left = 0, right = 0, maxLen = 0;
            while (right < nums.length) {
                if (nums[right] == 1)
                    maxLen = Math.max(maxLen, right - left + 1);
                else
                    left = right + 1;
                right++;
            }
            return maxLen;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 0;
        System.out.println(longestOnes(nums, k));
    }
}
