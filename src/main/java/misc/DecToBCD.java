package misc;

import java.util.ArrayList;
import java.util.List;

public class DecToBCD {
    public static void main(String[] args) {

        int decNumber = 11;
        List expectedBinary = new ArrayList();

        // parse given number to Integer array
        int temp = decNumber;
        ArrayList<Integer> arrayOfDigits = new ArrayList<Integer>();
        do {
            arrayOfDigits.add(temp % 10);
            temp /= 10;
        } while (temp > 0);

        for (int i = 0; i < arrayOfDigits.size(); i++) {
            // translate Dec to Bin for each figure
            int decFigure = arrayOfDigits.get(i);
            int binaryCount = 0;
            while (decFigure >= 1) {
                expectedBinary.add((decFigure % 2));
                decFigure /= 2;
            }
            System.out.print(expectedBinary.toString());
        }
    }
}