package lc.stack.e;

import java.util.Stack;

public class MaximumNestingDepthOfTheParentheses {
    // O(n) O(n)
    static int maxDepth_stack(String s) {
        int depth = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c== '{' || c=='[' )
                stack.push(c);
            if (c == ')' || c== '}' || c==']')
                stack.pop();
            depth = Math.max(stack.size(), depth);
        }
        return depth;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth_stack(s));
    }
}

