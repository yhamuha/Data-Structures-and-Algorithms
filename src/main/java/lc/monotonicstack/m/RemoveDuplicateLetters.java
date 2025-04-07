package lc.monotonicstack.m;

import java.util.Stack;

public class RemoveDuplicateLetters {
    // O(n) O(n)
    static String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++)
            lastIndex[s.charAt(i) - 'a'] = i;
        boolean[] seen = new boolean[26];
        Stack<Integer> stackOfUniqueChars = new Stack();
        for (int i = 0; i < s.length(); i++) {
            int currChar = s.charAt(i) - 'a';
            if (seen[currChar]) continue;
            while (!stackOfUniqueChars.isEmpty() && stackOfUniqueChars.peek() > currChar && i < lastIndex[stackOfUniqueChars.peek()])
                seen[stackOfUniqueChars.pop()] = false;
            stackOfUniqueChars.push(currChar);
            seen[currChar] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!stackOfUniqueChars.isEmpty())
            sb.append((char) (stackOfUniqueChars.pop() + 'a'));
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(removeDuplicateLetters(s));
    }
}
