package lc.arrays;

import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
        Integer[] integers = new Integer[] {3, 1, 5};
        // 1, 3, 5
        Arrays.sort(integers);
        // 5, 3, 1
        Arrays.sort(integers, Collections.reverseOrder());
    }
}
