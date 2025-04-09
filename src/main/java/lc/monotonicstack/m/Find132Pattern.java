package lc.monotonicstack.m;

import java.util.Stack;
// O(n) O(n)
public class Find132Pattern {
    static boolean find132pattern(int[] nums) {
        int size = nums.length;
        int[] min = new int[size];
        min[0] = nums[0];
        for (int i = 1; i < size; i++) /*define min elem*/
            min[i] = Math.min(min[i-1], nums[i]);
        Stack<Integer> stack = new Stack();
        for (int j = size-1; j>=0; j--) {
            if (nums[j] > min[j]) {
                while (!stack.isEmpty() && stack.peek() <= min[j])
                    stack.pop();
                if (!stack.isEmpty() && stack.peek() < nums[j])
                    return true;
                stack.push(nums[j]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,4};
        System.out.println(find132pattern(nums));
    }
}
