package lc.stack.m;

import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    // O(n) O(n)
    static String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder valid = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty())
                    valid.setCharAt(i, ' ');
                else
                    stack.pop();
            }
        }
        while (!stack.isEmpty())
            valid.setCharAt(stack.pop(), ' ');
        return valid.toString().replace(" ", "");
    }

    public static void main(String[] args) {
        String input = "a)b(c)d";
        System.out.println(minRemoveToMakeValid(input));
    }
}
