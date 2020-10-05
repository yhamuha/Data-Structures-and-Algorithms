package misc.bitwise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.BitSet;
import java.util.Scanner;

// file contains 4_000_000_000 integers
// and 1 GiB RAM

public class GetMissedNumber {

    static int getMissedNumber(String path, int start, int end) throws FileNotFoundException {

        BitSet bitSet = new BitSet(end - start + 1);
        Scanner in = new Scanner(new FileReader(path));

        while (in.hasNextInt()) {
            int number = in.nextInt() - start;
            bitSet.set(number);
        }
        in.close();

        for(int i=0; i< bitSet.size(); i++)
            if(!bitSet.get(i)) return i + start;

        return -1;
    }

    public static void main(String[] args) {
        try {
            System.out.println(getMissedNumber("C:/tmp/numbers.txt", 3, 8));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
