package lc.mathandgeometry.e;

import java.util.Arrays;

public class PlusOne {
    // O(n) O(n)
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9)
                digits[i] = 0;
            else {
                digits[i]++;
                return digits;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] digits1 = {1, 2, 3};
        int[] result1 = plusOne.plusOne(digits1);
        System.out.println("Result 1: " + Arrays.toString(result1));
        int[] digits3 = {9, 9};
        int[] result3 = plusOne.plusOne(digits3);
        System.out.println("Result 3: " + Arrays.toString(result3));
    }
}
