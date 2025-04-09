package lc.monotonicstack.m;

import java.util.Stack;

public class MaxChunksToMakeSorted {
    // O(n) O(n)
    static int maxChunksToSorted(int[] arr) {
        Stack<Integer> stack = new Stack();
        for(int x : arr){
            if (stack.isEmpty() || stack.peek() < x)
                stack.push(x);
            else {
                int max = x;
                while(!stack.isEmpty() && stack.peek() > x)
                    max = Math.max(max, stack.pop());
                stack.push(x);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,4};
        System.out.println(maxChunksToSorted(arr));
    }
}
