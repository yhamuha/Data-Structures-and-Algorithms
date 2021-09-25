package misc.problem_solving;

import java.util.Arrays;

/**
 *
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,2,9};
//        System.out.println(Arrays.toString(plusOne(digits)));
        System.out.println(Arrays.toString(plusOne2(digits)));
    }

    static int[] plusOne(int[] digits) {
        for (int i=digits.length-1; i>=0; i--){
            if (digits[i]<9){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }

    static int[] plusOne2(int[] digits) {
        int n = digits.length;

        // loop from the end to start
        for (int idx = n - 1; idx >= 0; --idx) {
            // if digit is 9; set to 0
            if (digits[idx] == 9) {
                digits[idx] = 0;
            }
            // if digit < than 9 - just incrementing
            else {
                digits[idx]++;
                return digits;
            }
        }

        // if digits all the 9th
        // increase digits[]
        digits = new int[n + 1];
        //add on the first place "1"
        digits[0] = 1;

        return digits;
    }
}
