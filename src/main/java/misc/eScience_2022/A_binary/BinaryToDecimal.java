package misc.eScience_2022.A_binary;

public class BinaryToDecimal {
    public static void main(String[] args) {

        // using Integer.parseInt() method
        String binaryString = "1101";
        int decimal = Integer.parseInt (binaryString,2);
        System.out.println(decimal);

        // using custom logic
        System.out.println("Decimal of 1010 is: " + binaryToDecimal(1010));
    }

    public static int binaryToDecimal (int binary) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                // get LSB
                int temp = binary % 10;
                // calculate for n "1" bit
                decimal += temp * Math.pow (2, n);
                // get next LSB
                binary = binary / 10;
                n++;
            }
        }
        return decimal;
    }
}
