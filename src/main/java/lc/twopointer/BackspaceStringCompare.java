package lc.twopointer;

import java.util.Stack;

public class BackspaceStringCompare {
    // O(n) O(n)
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='#')
                if(!stackS.isEmpty())
                    stackS.pop();
            else
                stackS.push(c);
        }
        for(char c: t.toCharArray()){
            if(c== '#')
                if(!stackT.isEmpty())
                    stackT.pop();
            else
                stackT.push(c);
        }
        if(stackS.equals(stackT))
            return true;
        return false;
    }

    public static void main(String[] args) {
        var bsc = new BackspaceStringCompare();
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(bsc.backspaceCompare(s, t));
    }
}
