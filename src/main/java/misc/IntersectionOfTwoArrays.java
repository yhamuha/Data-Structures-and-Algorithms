package misc;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The {@code IntersectionOfTwoArrays} class
 * shows implements two arrays intersection
 * using ArrayList
 */
public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

        // init two int[] arrays
        int[] arr1 = {1, 2, 2, 2, 2, 2, 2, 3, 6, 6, 6, 6, 6, 6,};
        int[] arr2 = {7, 5, 3, 6, 6, 2, 2, 3, 6, 6, 6, 6, 6, 6, 6, 6,};

        // sorting int[] arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList result = new ArrayList<>();
        int i = 0;
        int j = 0;

        // running by arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                j++;

            } else if (arr1[i] < arr2[j]) {
                i++;

            } else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println(result);
    }
}


