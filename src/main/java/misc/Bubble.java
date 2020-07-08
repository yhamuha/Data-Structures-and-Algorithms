package misc;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * O(1) - space complexity
 * O(n^2) - time complexity
 */
public class Bubble {

    public static void main(String[] args) {
        int min = 0;
        int max = 10000;
        int[] arr = new int[5_000];
        int j=0;
        for (int i = arr.length-1; i>=0; i--) {
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            arr[j]=randomNum;
            j++;
        }
        System.out.println("input arr: \n" + Arrays.toString(arr));
        long start = System.currentTimeMillis();
        bubbleSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("output arr: \n" + Arrays.toString(arr));
        System.out.println("running time: " + (end - start) + " ms");
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i=0; i< array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    swap(array, i, i+1);
                    isSorted = false;
                }
            }
        }
    }

    public static void swap (int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
