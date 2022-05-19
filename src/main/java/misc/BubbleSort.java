package misc;
import java.util.Arrays;

/**
 * This class contains only one private method to bubble sorting.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {7, 3, 4, 11, 27, 8, 5};
        System.out.println(System.currentTimeMillis());
        int array[] = sort(arr);
        System.out.println("output: \n" + Arrays.toString(array));
        System.out.println(System.currentTimeMillis());
    }

    /**
     * Sorts the array using bubble classic algorithm.
     * @param arr the array to be sorted
     */
    public static int[] sort(int[] arr) {
        for(int i=0; i< arr.length-1; i++){
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
}
