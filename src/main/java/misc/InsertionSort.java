package misc;
import java.util.Arrays;
/**
 * <h1>InsertionSort</h1>
 * The InsertionSort implements classic insertion sort algorithm.
 * <p>
 * Implementation include time estimate measurements for ARRAY_SIZE elements.
 * 47-53 ms in average by 10 times measures
 */
public class InsertionSort {

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

    static int[] sort(int[] arr){
        for(int i=1; i<arr.length; i++) {
            for(int j=i; j>0 && (arr[j]<arr[j-1]); j--){
                int tmp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=tmp;
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
