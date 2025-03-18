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
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = " ";
        String test4 = "No 'x' in Nixon";
        String test5 = "0P";
        System.out.println(isPalindrome(test1));
        System.out.println(isPalindrome(test2));
        System.out.println(isPalindrome(test3));
        System.out.println(isPalindrome(test4));
        System.out.println(isPalindrome(test5));
    }
}
