package lc.stack.e;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    // O(n) O(n)
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i))
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder("");
        while (!stack.isEmpty())
            sb.append(stack.pop());
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString remover = new RemoveAllAdjacentDuplicatesInString();
        String test1 = "abbaca";
        System.out.println(remover.removeDuplicates(test1));
    }
}

