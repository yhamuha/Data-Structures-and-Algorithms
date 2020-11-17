package misc.sorting;

import java.util.Arrays;
/**
 * <h1>InsertionSort</h1>
 * The InsertionSort implements classic insertion sort algorithm.
 * <p>
 * Implementation include time estimate measurements for 50k elements.
 */
public class InsertionEx {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        int[] arr = new int[100_000];
        int j=0;
        for (int i = arr.length-1; i>=0; i--) {
            arr[j]=i;
            j++;
        }

        long start = System.currentTimeMillis();
        arr  = sort(arr);
        long end = System.currentTimeMillis();

        System.out.println("Insertion sort:");
        System.out.println("Execution time for " + arr.length + "  elements of array is: "
                + (end - start) + " ms");
    }

    /**
     * Insertion sorting
     * @param arr   input array
     * @return      sorted array
     */
    static int[] sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0 && (arr[j]<arr[j-1]); j--){

                // swap
                int tmp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=tmp;
            }
        }
        return arr;
    }
}
