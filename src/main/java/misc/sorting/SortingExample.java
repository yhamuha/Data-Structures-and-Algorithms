package misc.sorting;

import java.util.Arrays;

class SortingExample {

    public static void main (String[] args) {
        int[] arr = new int[] {9,7,5,3,1};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort (int[] arr) {
        for (int i=1; i<arr.length; i++) {
            for (int j=i; j>0 && (arr[j] < arr[j-1]); j--) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

}