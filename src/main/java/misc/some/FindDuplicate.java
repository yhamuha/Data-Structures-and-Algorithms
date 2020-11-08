package misc.some;

import java.util.Arrays;

/**
 *
 */
public class FindDuplicate {
    public static void main(String[] args) {

        int[] array = {1,2,3,5,3,5};

        Arrays.sort(array);

        for (int i = 0; i < array.length-1; i++) {
            {
                if (array[i] == array[i+1])
                    System.out.println("Duplicate number is: " + array[i]);

            }
        }
    }
}
