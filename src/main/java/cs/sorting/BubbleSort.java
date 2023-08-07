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

    void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) minIndex = j;
            }
            if (minIndex != i) swap(arr, minIndex, i);
        }
    }

    void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int unsorted = i;
            int sorted = unsorted - 1;
            while (sorted > -1 && arr[sorted] > arr[sorted + 1]) {
                swap(arr, sorted, sorted + 1);
                sorted--;
            }
        }
    }
}
