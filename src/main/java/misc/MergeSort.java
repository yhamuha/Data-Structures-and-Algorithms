package misc;

import java.util.Arrays;

/**
 * recursive mergeSort
 * use Divide and Conquer algorithmic paradigm
 * Time: O(n), levels O(log n): -> O(n log n) for worst, average and best
 * Space: O(n)
 *
 * pseudocode:
 * ================================
 * on input of n elem
 *  if n<2
 *      return
 *  else
 *      sort left half of elem
 *      sort right half of elem
 *      merge sorted halves
 * ================================
 */
public class MergeSort {

    public static void mergeSort (int[] array) {
        mergeSort(array, new int[array.length], 0, array.length-1);
    }

    private static void mergeSort(int[] array,int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int middle = (leftStart + rightEnd) / 2;
        mergeSort(array, temp, leftStart, middle);
        mergeSort(array, temp, middle + 1, rightEnd);
        mergeHalves(array, temp, leftStart, rightEnd);
    }

    private static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, left, temp, index, rightEnd - right + 1);
        System.arraycopy(array, leftStart, array, leftStart, size);
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 67, 32, 44, 876, 21, 13};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
