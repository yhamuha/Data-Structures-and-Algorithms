package misc;

public class BinToDec {

    public static final int BASE_DIGIT = 2;

    public static void main(String[] args) {

        int[] binaryNumber = {1,0,0,0};
        int[] decimalNumber = new int[binaryNumber.length];
        int decimal = 0;
        int power = 0;

        for (int i=binaryNumber.length-1; i>=0; i--) {
            decimalNumber[i] = binaryNumber[i] * (int) Math.pow(BASE_DIGIT, power++);
            decimal += decimalNumber[i];
        }
        System.out.println(decimal);
    }


}
