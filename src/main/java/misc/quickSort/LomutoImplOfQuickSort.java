package misc.quickSort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class LomutoImplOfQuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        quickSort(ar, 0, ar.length - 1);
        System.out.println(Arrays.toString(ar));
    }

    public static void quickSort(int[] ar, int low, int high) {
        if (low < high) {
            int p = partition(ar, low, high);
            quickSort(ar, 0, p - 1);
            quickSort(ar, p + 1, high);
        }
    }

    public static int partition(int[] ar, int l, int r) {
        int pivot = ar[r];
        int i = l;
        for (int j = l; j < r; j++) {
            if (ar[j] <= pivot) {
                int t = ar[j];
                ar[j] = ar[i];
                ar[i] = t;
                i++;
            }
        }
        int t = ar[i];
        ar[i] = ar[r];
        ar[r] = t;

        return i;
    }
}
