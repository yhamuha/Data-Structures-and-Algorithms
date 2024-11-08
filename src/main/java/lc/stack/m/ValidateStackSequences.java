package lc.stack.m;

import java.util.Stack;

public class ValidateStackSequences {
    // O(n) O(n)
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j=0;
        for(int each : pushed){
            stack.push(each);
            while(!stack.isEmpty() && j<popped.length && stack.peek()==popped[j]){
                j++;
                stack.pop();
            }
        }
        return j==popped.length;
    }

    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        ValidateStackSequences vss = new ValidateStackSequences();
        System.out.println(vss.validateStackSequences(pushed, popped));
    }
}
