package lc.stack.e;

import java.util.Stack;

public class ReverseString {
    // O(n) O(n)
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length;i++)
            stack.push(s[i]);
        int index=0;
        while(!stack.isEmpty()){
            s[index]=stack.pop();
            index++;
        }
    }

    public static void main(String[] args) {
        ReverseString reverser = new ReverseString();
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        reverser.reverseString(input);
        System.out.println(new String(input));
    }
}
