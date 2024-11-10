package lc.monotonicstack.m;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementII {
    // O(n) O(n)
    public int[] nextGreaterElements(int[] nums){
       int n = nums.length;
       int[] output_arr = new int[n];
       Arrays.fill(output_arr, -1);
       Stack<Integer> stack = new Stack();
       for (int i=0; i<n*2; i++) {
           while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n] )
               output_arr[stack.pop()] = nums[i % n];
           if (i < n) stack.push(i);
       }
       return output_arr;
    }

    public static void main(String[] args) {
        NextGreaterElementII ngeII = new NextGreaterElementII();
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(ngeII.nextGreaterElements(nums)));
    }
}
