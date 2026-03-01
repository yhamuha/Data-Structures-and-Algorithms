package lc.stack.m;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementInArray {
    // O(n) O(n)
    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int index = stack.pop();
                result[index] = nums[i];
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,3,2,4,3};
        System.out.println(nextGreaterElement(nums));
    }
}
