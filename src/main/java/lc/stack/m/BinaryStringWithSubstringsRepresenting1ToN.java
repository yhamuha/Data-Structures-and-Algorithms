package lc.stack.m;

import java.util.Stack;

public class BinaryStringWithSubstringsRepresenting1ToN {
    // O(n) O(n)
    static boolean containsAllBinaryRepresentations(String binaryString, int n) {
        Stack<String> stack = new Stack<>();
        for (int i = 1; i <= n; i++) {
            String binaryRepresentation = Integer.toBinaryString(i);
            stack.push(binaryRepresentation);
        }
        while(!stack.isEmpty()) {
            String substr = stack.pop();
            if (!binaryString.contains(substr))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "0110";
        int n = 3;
        System.out.println(containsAllBinaryRepresentations(s, n));
    }
}
