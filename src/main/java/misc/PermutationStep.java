package misc;

import java.util.Arrays;

public class PermutationStep {
    // O(n) O(n)
    public static int PermutationStep(int num) {
        char[] numChars = String.valueOf(num).toCharArray();
        int n = numChars.length;
        int i = n - 1;
        while (i > 0 && numChars[i - 1] >= numChars[i])
            i--;                                              // set i pointer and identify if
        if (i <= 0)                                           // all the digits not the same
            return -1;                                        // or in DESC order, otherwise return -1

        int j = n - 1;
        while (numChars[j] <= numChars[i - 1])                // set j pointer
            j--;
        char temp = numChars[i - 1];                          // reverse digits
        numChars[i - 1] = numChars[j];
        numChars[j] = temp;
        Arrays.sort(numChars, i, n);                          // soft the least after reverse
        int nextNum = Integer.parseInt(new String(numChars)); // transform to int
        return nextNum;
    }

    public static void main(String[] args) {
        int num = 41352;
        System.out.println(PermutationStep(num));
    }
}
