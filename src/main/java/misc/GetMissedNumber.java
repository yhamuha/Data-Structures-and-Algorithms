package misc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.BitSet;
import java.util.Scanner;


public class GetMissedNumber {

    int getMissedNumber(String path, int start, int end) throws FileNotFoundException {

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

}
