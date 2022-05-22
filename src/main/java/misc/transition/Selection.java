package misc.transition;

import java.lang.*;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Selection {


    public static final int ARRAY_SIZE = 10000;
    private static long[] timeValue = new long[10];

    /**
     * The entry point of application.
     * created array
     * filled in using randomly numbers between given range
     * sorted
     * show the estimate running time
     * @param args the input arguments do no using
     */
    public static void main(String[] args) {

        // 69-114 ms in average by 10 times measures



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
     * Service method Sort int [ ].
     *
     * @param arr input arr
     * @return sorted int [ ]
     */
    static int[] sort(int[] arr){
        for(int i=0; i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
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
