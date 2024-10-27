package lc.arraysandhashing.e;

import java.util.Arrays;

public class RunningSumOf1dArray {
    // O(n), O(1)
    static int[] getRunningSum (int[] arr) {
        for (int i = 0; i < arr.length-1; i++)
            arr[i+1] = arr[i] + arr[i+1];
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(getRunningSum(arr)));
    }
}