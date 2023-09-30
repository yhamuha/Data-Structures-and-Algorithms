package lc.stack;

import java.util.Stack;

public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j=0;
        for(int each : pushed){
            stack.push(each);
            while(!stack.isEmpty()
                    && j<popped.length //take care of overflow case
                    && stack.peek()==popped[j]){
                j++;
                stack.pop();
            }
        }
        return j==popped.length;
    }

    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,3,5,1,2};
        ValidateStackSequences vss = new ValidateStackSequences();
        System.out.println(vss.validateStackSequences(pushed, popped));
    }
}
