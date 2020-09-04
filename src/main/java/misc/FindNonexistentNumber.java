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

        // space complexity: 125 KB
        BitSet bitsSet = new BitSet(1_000_000);

        Scanner in = new Scanner(new FileReader(path));

        // time complexity: O(N)
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

    // space complexity O(1)
    int getMissingNumberRangeIndex(int[] counters) {
        for (int i=0; i<counters.length; i++)
            if (counters[i] < 1_000_000) return i;
            return -1;
    }

    // space complexity .. takes a long time but .. O(1)
    int getMissingNumber(BitSet bitSet, int start) {
        for(int i=0; i< bitSet.size(); i++)
            if (!bitSet.get(i)) return i + start;
        return -1;
    }


    // General time complexity O(N)
    // General space complexity 129 KB = 125.9 KiB

    int findFirstMissedNumber(String path) throws FileNotFoundException {
        int rangeSize = 1_000_000;
        // time O(N)
        // space 4 KB
        int[] counters = getFilledCounters(path);
        // O(1)
        int rangeIndex = getMissingNumberRangeIndex(counters);
        if (rangeIndex == -1) return -1;

        int start = rangeIndex * rangeSize;
        int end = start + rangeSize -1;

        // time O(N)
        // space 125 KB
        BitSet bitSet = getBitVector(path, start, end);
        // O(1)
        return getMissingNumber(bitSet, start);
    }

}


