package misc.linkedList;

import java.util.Arrays;

public class SlowRemove {
    public static void main(String[] args) {
        int[] array = new int[] {1,3,5,6,4,3,6};
        System.out.println(Arrays.toString(removeIthElement(array, 3)));
    }

    // slow remove i-th element from array
    // time complexity: 0(n)
    static int[] removeIthElement(int[] arr, int index) {
        if (arr.length == 0 || index >= arr.length || index < 0) return null;
        // create array with length-1
        int[] result = new int[arr.length - 1];
        // run through entire array
        for (int i = 0; i < arr.length; i++) {
            // copy array before our index
            if (i < index) result[i] = arr[i];
            // copy array after given index
            else if (i > index) result[i - 1] = arr[i];
        }
        // return formed array
        return result;
    }
}
