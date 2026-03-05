package lc.stack.e;

import java.util.Stack;

public class ValidPalindrome {
    // O(n) O(n)
    static boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char ch : chars) {
            if (Character.isLetterOrDigit(ch))
                stack.push(ch);
        }
        for(char ch : chars) {
            if(Character.isLetterOrDigit(ch)) {
                if (ch != stack.pop())
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
}
