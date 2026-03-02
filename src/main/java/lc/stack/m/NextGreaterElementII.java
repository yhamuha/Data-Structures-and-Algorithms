package lc.stack.m;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
    // O(n) O(n)
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for (int i = 0; i < 2 * n; i++) {
            int idx = i % n;
            while (!stack.isEmpty() &&
                    nums[idx] > nums[stack.peek()]) {
                ans[stack.pop()] = nums[idx];
            }
            if (i < n) {
                stack.push(idx);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,3,2,4,3};
        System.out.println(nextGreaterElements(nums));
    }
}
