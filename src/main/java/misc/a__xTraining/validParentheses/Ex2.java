package misc.a__xTraining.validParentheses;

import java.util.Stack;

/**
 *
 */
public class Ex2 {

    public static void main (String[] args) {
        String str = "{}";
        System.out.println(isValidParentheses(str));
    }

    static boolean isValidParentheses (String str) {

        Stack<Character> stack = new Stack();

        for (char ch : str.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.empty()) return false;
                else {
                    char top = (Character) stack.peek();
                    if (ch == ')' && top == '(' ||
                            ch == '}' && top == '{' ||
                            ch == ']' && top == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }

            }


        }

        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
