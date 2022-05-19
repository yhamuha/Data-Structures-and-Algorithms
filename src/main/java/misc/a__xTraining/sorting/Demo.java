package misc.a__xTraining.sorting;

import java.util.Arrays;

/**
 *
 */
public class Demo {

    public static void main(String[] args) {
        int[] arr = new int[] {3,4,2,1,0};
        System.out.println(Arrays.toString(sort(arr)));
    }

    private static int[] sort (int[] arr) {
        for(int i=0; i<arr.length;i++) {
            int minIndex = i;
            for(int j=i+1; j<arr.length;j++) {
                if(arr[minIndex] > arr[j])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
