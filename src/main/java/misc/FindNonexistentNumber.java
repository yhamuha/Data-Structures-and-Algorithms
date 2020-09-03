package misc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FindNonexistentNumber {
    int[] getFilledCounters(String path) throws FileNotFoundException {
        int[] counters = new int[1000];

        Scanner in = new Scanner(new FileReader(path));
        while (in.hasNextInt()) {
            int counterIndex = in.nextInt() / 1_000_000;
            counters[counterIndex]++;
        }
        in.close();
        return counters;
    }
}


