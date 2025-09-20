package lc.stack.m;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveAllAdjacentDuplicatesInStringII {
    // O(n) O(n) #walmart
    public String removeDuplicates(String s, int k) {
        if (s == null || k <= 1)
            throw new IllegalArgumentException("Invalid Input");
        int len = s.length();
        if (len < k)
            return s;
        Deque<Integer> countStack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(s.charAt(i));
            int sbLastIdx = sb.length() - 1;
            if (sbLastIdx > 0 && sb.charAt(sbLastIdx - 1) == sb.charAt(sbLastIdx)) {
                int count = countStack.pop();
                if (count + 1 < k)
                    countStack.push(count + 1);
                else
                    sb.setLength(sb.length() - k);
            } else
                countStack.push(1);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        int k = 3;
        RemoveAllAdjacentDuplicatesInStringII raadisII
                = new RemoveAllAdjacentDuplicatesInStringII();
        String result = raadisII.removeDuplicates(s, k);
        System.out.println(result);
    }
}
