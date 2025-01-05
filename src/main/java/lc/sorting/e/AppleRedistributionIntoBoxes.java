package lc.sorting.e;

import java.util.Arrays;

public class AppleRedistributionIntoBoxes {
    // O(n log n; avg) O(1)
    public int minimumBoxes(int[] a, int[] c) {
        int ans = 0;
        int s = Arrays.stream(a).sum();
        quickSort(c, 0, c.length - 1);
        int i = c.length - 1;
        while (i >= 0) {
            s -= c[i];
            ans++;
            if (s <= 0)
                break;
            i--;
        }
        return ans;
    }
    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        AppleRedistributionIntoBoxes solution = new AppleRedistributionIntoBoxes();
        int[] apple = {1, 3, 2};
        int[] capacity = {4, 3, 1, 5, 2};
        System.out.println(solution.minimumBoxes(apple, capacity));
    }
}
