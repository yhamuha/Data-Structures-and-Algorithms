package misc;

import jdk.nashorn.internal.objects.NativeInt8Array;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.BitSet;
import java.util.Scanner;


public class FindNonexistentNumber {
    private BitSet bitSet;

    int[] getFilledCounters(String path) throws FileNotFoundException {

        // space complexity = 4KB
        int[] counters = new int[1000];

        Scanner in = new Scanner(new FileReader(path));

        // time complexity = O(N)
        while (in.hasNextInt()) {
            int counterIndex = in.nextInt() / 1_000_000;
            counters[counterIndex]++;
        }
        in.close();
        return counters;
    }

    BitSet getBitVector(String path, int start, int end) throws FileNotFoundException {

        BitSet bitsSet = new BitSet(1_000_000);
        Scanner in = new Scanner(new FileReader(path));

        while (in.hasNextInt()) {
            int number = in.nextInt();
            if (number >= start && number <= end) {
                int bitIndex = number - start;
                bitSet.set(bitIndex);
            }
        }
        in.close();
        return bitSet;

    }
}


