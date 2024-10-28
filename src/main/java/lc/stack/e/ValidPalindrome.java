package lc.stack.e;

import java.util.Stack;

public class ValidPalindrome {
    // O(n) O(n)
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char ch : chars) {
            if (Character.isLetterOrDigit(ch))
                stack.push(ch);
        }
        for(char c : chars) {
            if(Character.isLetterOrDigit(c)) {
                if (c != stack.pop())
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = " ";
        String test4 = "No 'x' in Nixon";
        String test5 = "0P";
        System.out.println(vp.isPalindrome(test1));
        System.out.println(vp.isPalindrome(test2));
        System.out.println(vp.isPalindrome(test3));
        System.out.println(vp.isPalindrome(test4));
        System.out.println(vp.isPalindrome(test5));
    }
}
