package misc;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This class contains only one private method to bubble sorting.
 *  88-91 ms in average by 10 times measures
 *
 */
public class BubbleSort {

    public static final int ARRAY_SIZE = 10000;
    private static long[] timeValue = new long[10];

    public static void main(String[] args) {

        // run 10 times
        for (int i = 0; i<10; i++) {
            int array[] = initArray(ARRAY_SIZE);
            long start = System.currentTimeMillis();
            int result[]  = sort(array);
            long end = System.currentTimeMillis();
            // collect values
            timeValue[i] = end-start;
        }

        // get average
        long tempValue = 0;
        for (int i=0; i<timeValue.length; i++) {
            tempValue += timeValue[i];
        }
        long average = tempValue / timeValue.length;

        System.out.println("average: " + average);

    }

    /**
     * Sorts the array using bubble classic algorithm.
     * @param arr the array to be sorted
     */
    public static int[] sort(int[] arr) {
        for(int i=0; i< arr.length-1; i++) {
            for (int j=arr.length-1; j>i; j--) {
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    static int[] initArray (int arraySize) {
        int[] arr = new int[arraySize];
        int j=0;
        for (int i = arr.length-1; i>=0; i--) {
            arr[j]=i;
            j++;
        }
        return arr;
    }
}
