package cs.sorting;

public class BubbleSort {

    void swap (int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    void bubbleSortOptimized(int[] arr) {
        int length = arr.length;
        while (length != 0) {
            int newLength = 0;
            for (int i = 1; i < length; i++) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                    newLength = i;
                }
            }
            length = newLength;
        }
    }
}
