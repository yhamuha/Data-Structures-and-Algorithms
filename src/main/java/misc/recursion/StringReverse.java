package misc.recursion;

import java.util.Arrays;

/**
 *  The {@code Factorial} class represents
 *  a two different approach for implementation:
 *  - using loop;
 *  - using recursion;
 */
public class StringReverse {
    /**
     * Main method.
     * @param args the command-line arguments (none)
     */
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * calculate the factorial using loop
     * @return void
     */
    static void reverse(int[] arr, int left, int right) {
        if (left == right) return;
        if (left > right) return;
        swap(arr, left, right);
        reverse(arr, left+1, right-1);
    }

    /**
     * calculate the factorial using loop
     * @return void
     */
    static void reverse(int[] arr) {
        reverse(arr, 0, arr.length - 1);
    }

    /**
     * just swap elements in array
     * @return void
     */
    static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
