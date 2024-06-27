package lc.stack.e;

import java.util.Stack;

public class BackspaceStringCompare {
    // O(n) O(n)
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackOne = new Stack<>();
        Stack<Character> stackTwo = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!stackOne.isEmpty()) {
                    stackOne.pop();
                }
            } else
                stackOne.push(c);
        }
        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!stackTwo.isEmpty()) {
                    stackTwo.pop();
                }
            } else
                stackTwo.push(c);
        }
            if (stackOne.equals(stackTwo))
                return true;
            else return false;
    }

        public static void main (String[]args){
            var bsc = new BackspaceStringCompare();
            String s = "ab#c";
            String t = "ad#c";
            System.out.println(bsc.backspaceCompare(s, t));
        }
    }
