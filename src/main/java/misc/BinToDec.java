package misc;

import java.util.Arrays;

public class BinToDec {

    public static final int BASE_DIGIT = 2;

    public static void main(String[] args) {

        int[] binaryNumber = {0,0,0,1};
        int[] decimalNumber = new int[binaryNumber.length];
        int decimal = 0;

        for (int i = binaryNumber.length - 1; i >=0; i--) {
            decimalNumber[i] = (int) Math.pow(BASE_DIGIT, i);
                decimal += decimalNumber[i];
                System.out.println(Arrays.toString(decimalNumber));
        }
        System.out.println(decimal);
    }
}
