package cs.recursion;

import java.util.Arrays;

public class ReverseArray {

    static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static void reverse(int[] arr, int left, int right) {
        if (left == right) return;
        if (left > right) return;
        swap(arr, left, right);
        reverse(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr, 0,4);
        System.out.println(Arrays.toString(arr));
    }
}
