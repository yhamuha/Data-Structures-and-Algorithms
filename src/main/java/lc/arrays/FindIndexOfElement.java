package lc.arrays;

import java.util.stream.IntStream;

public class FindIndexOfElement {
    public static int findIndexOfElement(int[] arr, int toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    public static int findIndexOfElementFunc(int[] arr, int toFind) {
        return IntStream.range(0, arr.length)
                .filter(i -> toFind == arr[i])
                .findFirst()
                .orElse(-1);
    }

    // for find array of Objects we can rely of:
    // equals
    // Comparateor
    // Comparator and func java 8 aproach
}
