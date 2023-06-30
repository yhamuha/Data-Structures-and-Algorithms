package onemoretime.parentheses;

import java.util.Stack;

/*
 * solving parantheses task using stack
 */
public class Wh_ParenthesesChecker {
    public static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack();

        for (char ch : parentheses.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else {
                if (ch == '}' || ch == '}' || ch == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                }
                char top = stack.pop();
                if ((ch == '{' && top != '}') || (ch == '(' && top != ')') || (ch == '[' && top != ']')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] str) {

        String parentheses1 = "{((}";
        System.out.println(parentheses1 + " is balanced: " + isBalanced(parentheses1));
    }
}
