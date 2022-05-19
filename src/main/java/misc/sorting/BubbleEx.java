package misc.sorting;

import java.util.Arrays;

/**
 *
 */
public class BubbleEx {

    public static void main(String[] args) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=i;
//        }
        int[] arr = new int[] {55,23,2,5,67,7,8,9,22,43,54};
        System.out.println( Arrays.toString(bubbleSort(arr)) );
        }
//        long start = System.currentTimeMillis();

//        long end = System.currentTimeMillis();
//        System.out.println("Bubble sort:");
//        System.out.println("Execution time for " + arr.length + "  elements of array is: "
//                + (end - start) + " ms");


    /**
     * Bubble sort
     * @param arr
     * @return
     */
    // bubble sort
    /*static int[] sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=arr.length-1; j>i; j--){
                if(arr[j]<arr[j-1]){

                    // swap
                    int tmp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                }
            }
        }
        return arr;
    }*/

    static int[] bubbleSort (int[] arr) {

        for(int i=0; i<arr.length-1;i++) {
            for (int j=arr.length-1; j>i; j--) {
                if (arr[j]<arr[j-1]) {

                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
}
