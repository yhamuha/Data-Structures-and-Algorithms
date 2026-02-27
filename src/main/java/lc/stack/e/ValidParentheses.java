package lc.stack.e;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    // O(n) O(n) #amazon #ibm #walmart
    /*static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '{')
                stack.push(c);
            else if (c == '}' && !stack.isEmpty() & stack.peek() == '{') {
                stack.pop();
            } else if (c == ')' && !stack.isEmpty() & stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() & stack.peek() == '[') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }*/

    // O(1) time | O(n) space
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '('); mapping.put('}', '{'); mapping.put(']', '[');
        for (char c : s.toCharArray()) {
            if (mapping.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != mapping.get(c)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(){()}";
        System.out.println(isValid(s));
    }
}
