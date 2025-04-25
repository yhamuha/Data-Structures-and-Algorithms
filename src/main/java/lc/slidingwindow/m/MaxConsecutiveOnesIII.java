package lc.slidingwindow.m;

import java.util.ArrayList;
import java.util.List;

public class MaxConsecutiveOnesIII {
    // O(n) O(n)
    static int longestOnes(int[] nums, int k) {
        if (k != 0) {
            int l = 0, r = 0, maxLen = 0;
            List<Integer> indx = new ArrayList<>();
            while (r < nums.length) {
                if (nums[r] == 1) {
                    maxLen = Math.max(maxLen, r - l + 1);
                    r++;
                }
                else if (nums[r] == 0 && k > 0) {
                    indx.add(r);
                    k--;
                    maxLen = Math.max(maxLen, r - l + 1);
                    r++;
                }
                else if (nums[r] == 0 && k == 0) {
                    l = indx.get(0) + 1;
                    indx.remove(0);
                    k++;
                }
            }
            return maxLen;
        } else {
            int l = 0, r = 0, maxLen = 0;
            while (r < nums.length) {
                if (nums[r] == 1) {
                    maxLen = Math.max(maxLen, r - l + 1);
                } else
                    l = r + 1;
                r++;
            }
            return maxLen;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
}
