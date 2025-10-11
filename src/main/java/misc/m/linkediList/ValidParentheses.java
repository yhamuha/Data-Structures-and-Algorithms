package misc.m.linkediList;

import java.util.Stack;

public class ValidParentheses {
    // O(n) O(n)
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char currStackChar = stack.pop();
                if (currStackChar == '{' && c != '}'
                        || currStackChar == '(' && c != ')'
                        || currStackChar == '[' && c != ']' )
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";
        System.out.println(s1 + " → " + solution.isValid(s1));
        System.out.println(s2 + " → " + solution.isValid(s2));
        System.out.println(s3 + " → " + solution.isValid(s3));
        System.out.println(s4 + " → " + solution.isValid(s4));
        System.out.println(s5 + " → " + solution.isValid(s5));
    }
}
