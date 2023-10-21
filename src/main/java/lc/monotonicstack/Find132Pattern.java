package lc.monotonicstack;

import java.util.Stack;

/*
            3
         2/  \
     _1_/         123pattern

           3
      _1_/   \_2_  132pattern (what we need to find)
      needs to track this elements sequence

      predefine minimum element
      going through from right to the left using stack for check on each step

 */

// O(n) O(n)
public class Find132Pattern {
    public boolean find132pattern(int[] nums) {
        int size = nums.length;
        int[] min = new int[size];
        min[0] = nums[0];
        for (int i = 1; i < size; i++) {
            min[i] = Math.min(min[i-1], nums[i]);
        }

        Stack<Integer> stack = new Stack();
        for (int j = size-1; j>=0; j--) {
            if (nums[j] > min [j]) {
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
        Find132Pattern _132pattern = new Find132Pattern();
        int[] nums = {1,3,2,4};
        System.out.println(_132pattern.find132pattern(nums));
    }
}
