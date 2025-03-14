package lc.twopointer.m;

import java.util.Arrays;

public class TheKStrongestValuesInAnArray {
    // O(n log n) O(k)
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int median = arr[(arr.length - 1) / 2];
        int[] ans = new int[k];
        int left = 0, right = arr.length - 1;
        int index = 0;
        while (index < k) {
            if (median - arr[left] > arr[right] - median)
                ans[index++] = arr[left++];
            else
                ans[index++] = arr[right--];
        }
        return ans;
    }

    public static void main(String[] args) {
        TheKStrongestValuesInAnArray strongestValues = new TheKStrongestValuesInAnArray();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int[] result = strongestValues.getStrongest(arr, k);
        System.out.println(Arrays.toString(result));
    }
}
