package misc.some;

import java.util.Arrays;

/**
 *
 */
public class FindDuplicateNumber {
    public static void main(String[] args) {

        int[] array = {1,2,4,3,2};

        Arrays.sort(array);

        for (int i=0; i<array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    System.out.println("Duplicate number is: " + array[i]);
                    break;
                } else break;
            }
        }
    }
}