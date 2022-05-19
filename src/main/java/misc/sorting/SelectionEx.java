package misc.sorting;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 */
public class SelectionEx {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    /**
     * The entry point of application.
     * created array
     * filled in using randomly numbers between given range
     * sorted
     * show the estimate running time
     * @param args the input arguments do no using
     */
    public static void main(String[] args) {
//        int min = 0;
//        int max = 1000;
        int[] arr = new int[]{2,4,5,6,0,2};
//        int j=0;
//        for (int i = arr.length-1; i>=0; i--) {
//            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
//            arr[j]=randomNum;
//            j++;
//        }
//        long start = System.currentTimeMillis();
//        arr = sort(arr);
//        long end = System.currentTimeMillis();
//
//        System.out.println("Selection sort:");
//        System.out.println("Execution time for " + arr.length + "  elements of array is: "
//                + (end - start) + " ms");
        System.out.println(Arrays.toString(sort3(arr)));
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

            // swap
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        return arr;
    }


    static int[] sort2 (int[] arr) {

    for (int i=0; i<arr.length; i++) {
        int minIndex = i;
        for(int j=i+1; j<arr.length; j++) {
            if(arr[minIndex]> arr[j]) {
                minIndex = j;
            }
        }
        int tmp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tmp;
   }

        return arr;
    }



    static int[] sort3 (int[] arr) {

        for(int i=0; i<arr.length; i++) {
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }
}

