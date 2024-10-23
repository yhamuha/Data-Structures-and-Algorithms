package lc.stack.e;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    // O(n) O(n)
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!st.isEmpty() && st.peek() == s.charAt(i))
                st.pop();
            else
                st.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder("");
        while (!st.isEmpty())
            sb.append(st.pop());
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString remover = new RemoveAllAdjacentDuplicatesInString();
        String test1 = "abbaca";
        String test2 = "azxxzy";
        String test3 = "aaaaaa";
        String test4 = "a";
        String test5 = "";
        System.out.println(remover.removeDuplicates(test1));
        System.out.println(remover.removeDuplicates(test2));
        System.out.println(remover.removeDuplicates(test3));
        System.out.println(remover.removeDuplicates(test4));
        System.out.println(remover.removeDuplicates(test5));
    }
}

