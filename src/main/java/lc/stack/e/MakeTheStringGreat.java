package lc.stack.e;

import java.util.Stack;

public class MakeTheStringGreat {
    // O(n) O(n)
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty())
                stack.push(ch);
            else {
                if ((Character.isUpperCase(stack.peek()) != Character.isUpperCase(ch))
                        && (Math.abs(stack.peek() - ch) == 32))
                    stack.pop();
                else
                    stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        MakeTheStringGreat mg = new MakeTheStringGreat();
        String test1 = "leEeetcode";
        String test2 = "abBAcC";
        String test3 = "s";
        String test4 = "dDzeE";
        String test5 = "Pp";
        System.out.println(mg.makeGood(test1));
        System.out.println(mg.makeGood(test2));
        System.out.println(mg.makeGood(test3));
        System.out.println(mg.makeGood(test4));
        System.out.println(mg.makeGood(test5));
    }
}
