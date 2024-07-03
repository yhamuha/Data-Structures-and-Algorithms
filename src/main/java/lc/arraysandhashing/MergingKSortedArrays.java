package lc.arraysandhashing;

import java.util.Arrays;

public class MergingKSortedArrays {
    // O(n^2) O(1)
    public static void mergeKArrays(int[][] arr, int[] output){
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                output[k++] = arr[i][j];
        }
        Arrays.sort(output);
    }
    public static void printArray(int[] arr, int size){
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args){
        int[][] arr = { { 2, 6, 12, 34 },
                        { 1, 9, 20, 1000 },
                        { 23, 34, 90, 2000 } };
        int k = 4, n = 3;
        int[] output = new int[n * k];
        mergeKArrays(arr, output);
        printArray(output, n * k);
    }
}
