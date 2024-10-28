package lc.stack.m;

import java.util.Stack;

public class RemovingStarsFromAString {
    // O(n) O(n)
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (!stack.isEmpty() && s.charAt(i) == '*')
                stack.pop();
            else if (s.charAt(i) != '*')
                stack.push(s.charAt(i));
        }
        StringBuilder str = new StringBuilder();
        for (char ch : stack)
            str.append(ch);
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        RemovingStarsFromAString rsfs = new RemovingStarsFromAString();
        System.out.println(rsfs.removeStars(s));
    }
}
