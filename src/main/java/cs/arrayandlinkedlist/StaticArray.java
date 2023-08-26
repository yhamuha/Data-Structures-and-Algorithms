package cs.arrayandlinkedlist;

import java.util.Arrays;

public class StaticArray {
    public static void insertEnd(int[] arr, int n, int length, int capacity) {
        if (length < capacity) {
            arr[length] = n;
        }
    }

    public static void removeEnd(int[] arr, int length) {
        if (length > 0) {
            arr[length - 1] = 0;
            length--;
        }
    }

    public void insertMiddle(int[] arr, int i, int n, int length) {
        for (int index = length - 1; index > i - 1; index--) {
            arr[index + 1] = arr[index];
        }
        arr[i] = n;
    }

    public void removeMiddle(int[] arr, int i, int length) {
        for (int index = i + 1; index < length; index++) {
            arr[index - 1] = arr[index];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        int n = 2;
        int length = 2;
        int capacity = 3;
        insertEnd(arr,n, length, capacity);
        removeEnd(arr, length);
        System.out.println(Arrays.toString(arr));
    }
}
