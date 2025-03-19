package lc.stack.m;

import java.util.Stack;

public class RemovingStarsFromAString {
    // O(n) O(n)
    static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (!stack.isEmpty() && s.charAt(i) == '*')
                stack.pop();
            else if (s.charAt(i) != '*')
                stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : stack)
            sb.append(ch);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Start*gated*";
        System.out.println(removeStars(s));
    }
}
