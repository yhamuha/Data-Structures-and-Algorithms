package misc;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This class contains only one private method to bubble sorting.
 * ~75 ms in average
 *
 */
public class BubbleSort {

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

        long start = System.currentTimeMillis();
        int array[] = sort(arr);
        System.out.println("output: \n" + Arrays.toString(array));
        long end = System.currentTimeMillis();
        System.out.println(end-start);
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
