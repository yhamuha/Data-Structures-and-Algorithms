package cs.arrayandlinkedlist;

import java.util.Arrays;

/*
 Remove i-th element from static array
 Time Complexity O(N)
 */
public class RemoveIthElement {

    public static int[] removeIthElement(int[] arr, int index) {
        if (arr.length == 0 || index >= arr.length || index < 0) return null;
        int[] result = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < index) result[i] = arr[i];          // copy all elem before deleted one
            else if (i > index) result[i - 1] = arr[i]; // copy all elem after deleted one
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(removeIthElement(arr, 2)));
    }
}
