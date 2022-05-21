package misc;
import java.util.Arrays;
/**
 * <h1>InsertionSort</h1>
 * The InsertionSort implements classic insertion sort algorithm.
 * <p>
 * Implementation include time estimate measurements for _k elements.
 */
public class InsertionSort {

    public static final int ARRAY_SIZE = 10000;
    public static final int ARRAY[] = {1,5,4,0};

    public static void main(String[] args) {

//        int array[] = initArray(ARRAY_SIZE);

        long start = System.currentTimeMillis();
        int result[]  = sort(ARRAY);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
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
