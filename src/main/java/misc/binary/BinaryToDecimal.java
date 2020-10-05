package misc.binary;

import java.util.Scanner;

class BinaryToDecimal {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int binNum, d, s = 0, power = 0;
        System.out.print("Binary number: ");
        binNum = sc.nextInt();

        while (binNum != 0) {
            d = binNum % 10;
            s += d * (int) Math.pow(2, power++);
            binNum /= 10;
        }
        System.out.println("Decimal: " + s);
        sc.close();
    }
}