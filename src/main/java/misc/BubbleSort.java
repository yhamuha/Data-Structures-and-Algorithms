package misc;
import java.util.Arrays;

/**
 * This class contains only one private method to bubble sorting.
 */
public class BubbleSort {

    /**
     * ANSI code for particular color also with reset code.
     */
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        int[] arr = {7, 3, 4, 11, 27, 8};
        System.out.println("input: \n" + Arrays.toString(arr));
        arr = sort(arr);
        System.out.println("output: \n" + Arrays.toString(arr));
    }

    /**
     * Sorts the array using bubble classic algorithm.
     * @param arr the array to be sorted
     */
    private static int[] sort(int[] arr) {
        for (int i=0; i<arr.length-1; i++){
            for(int j=arr.length-1; j>i; j--){
                if (arr[j]<arr[j-1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = tmp;
                }
            }
        }
        return arr;
    }

}
