package misc.a__xTraining.validParentheses;

import java.util.Stack;

/**
 *
 */

class Solution {

    public static void main(String[] args) {
        System.out.println(isValid("([])"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty() || !isMatchingBracket(stack.peek(), c)) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static boolean isMatchingBracket(char openingBracket, char closingBracket) {
        switch(openingBracket) {
            case '(':
                return closingBracket == ')';
            case '{':
                return closingBracket == '}';
            case '[':
                return closingBracket == ']';
        }
        return false;
    }
}