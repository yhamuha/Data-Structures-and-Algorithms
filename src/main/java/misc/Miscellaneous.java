package misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Miscellaneous {
    public static void main(String[] args) {

        AddValuesToString();

        System.out.println(parseIntegerToArray(24));

        byteShift();

        printTriangle();

        System.out.println(printBaseAndExponent(2,3));

        drawRect();

        printMultiplicationEvenAndOdd();

    }

    // check the array elements and add to string some value
    // input:
    //          int[] array = {-1, 2, -3, 4, -5, 5};
    // output:
    //          .<><><>
    static void AddValuesToString () {
        String string = ".";
        boolean trigger = true;
        int[] array = {-1, 2, -3, 4, -5, 5};
        for (int i=0; i<array.length; i++ ) {
            if (array[i] > 0) {
                string += ">";
            } else {
                string += "<";
            }
        }
        System.out.println(string);
    }

    // parse given number to Integer array
    // input:
    //          decNumber = 24
    // output:
    //          ArrayList = {2, 4}
    static List<Integer> parseIntegerToArray (Integer decNumber) {
        int temp = decNumber;
        List<Integer> arrayOfDigits = new ArrayList<Integer>();
        do {
            arrayOfDigits.add(temp % 10);
            temp /= 10;
        } while (temp > 0);
        Collections.reverse(arrayOfDigits);
        return arrayOfDigits;
    }

    // >>, <<
    static void byteShift() {
        byte b = 100;
        // ASL = *2
        //
        System.out.println(b << 1);
        // ASR = /2
        System.out.println(b >> 1);
    }

    //      # #
    //     #  #
    //    #   #
    //   ######
    static void printTriangle() {

        System.out.println();

        for(int i = 6; i >=1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("#");

            for (int k = 6; k >= i; k--) {
                System.out.print(" ");
            }

            for (int k = 6; k >= i; k--) {
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();
        }
        for(int k = 7; k>=0; k--){
            System.out.print("# ");
        }
        System.out.println();
    }

    // 2^3
    static int printBaseAndExponent(int b, int e) {

        int result = 1, i = 1;
        do {
            result = result * b;
            i++;
        } while (i <= e);

        return result;
    }

    // draw rectangle
    // 1 * * * *
    // 1 2 * * *
    // 1 2 3 4 *
    // 1 2 3 4 5
    static void drawRect() {
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4.4s", j);
            }

            for (int k = 20; k > i; k--) {
                System.out.printf("%4.4s","*");
            }
            System.out.println();
        }
    }

    // multiplication for 100 odd and even values
    static void printMultiplicationEvenAndOdd() {
        int even=0, odd=1;

        // for 100 odd
        for (int i=1;i<=100;i+=2) {
            odd = odd*i;
        }

        // for 100 even
        for(int i=2;i<=100; i+=2){
            even= even+i;
        }
        System.out.println("Even: " + even + "   Odd: " + odd);
    }
}
