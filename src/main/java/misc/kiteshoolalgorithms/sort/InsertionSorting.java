package misc.kiteshoolalgorithms.sort;

import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {

        int array[] = initArray(10000);

        long start = System.currentTimeMillis();
        int result[]  = sort(array);
        long end = System.currentTimeMillis();
        System.out.println(Arrays.toString(result));
        System.out.println(end-start);
    }

    // from left to right
    // swapping [j-1] elements with [j] on each new step
    // O(n^2) O(1)
    static int[] sort (int[] array) {
        for (int i=1; i<array.length; i++){
            for (int j=i; j>0 && (array[j]<array[j-1]); j--){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
        return array;
    }

    // init array in desc order
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
