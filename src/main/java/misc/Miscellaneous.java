package misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Miscellaneous {
    public static void main(String[] args) {

        AddValuesToString();

        System.out.println(parseIntegerToArray(24));

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
    // decNumber = 24
    // output:
    // ArrayList = {2, 4}
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
}
