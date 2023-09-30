package lc.stack;

import java.util.Stack;

public class MaximumNestingDepthOfTheParentheses {
    // TC: O(n), SC: O(1)
    public int maxDepth(String s) {
        int depth =0, open =0;
        for(char c : s.toCharArray()) {
            if (c == '(') open++;
            if (c==')') open--;
            depth = Math.max(depth, open);
        }
        return depth;
    }

    // O(n) O(n)
    public int maxDepth_stack(String s) {

        int depth = 0;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {

            if (c == '(' || c== '{' || c=='[' ) {
                stack.push(c);
            }
            if (c == ')' || c== '}' || c==']') {
                stack.pop();
            }
            depth = Math.max(stack.size(), depth);
        }
        return depth;


    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        MaximumNestingDepthOfTheParentheses maxNestedOfParentheses = new MaximumNestingDepthOfTheParentheses();
        System.out.println(maxNestedOfParentheses.maxDepth(s));
    }
}

/*  (1+(2*3)+((8)/4))+1
   01  2   1 23 2  10
   0->0 valid parentheses
   3 is max depth
 */
