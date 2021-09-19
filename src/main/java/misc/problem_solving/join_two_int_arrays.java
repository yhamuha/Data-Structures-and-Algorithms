package misc.problem_solving;

/**
 *
 */
public class join_two_int_arrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {11,12,13,14,15,16,17,18,19,20};
        int[] arr3 = new int[20];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr3[index++] = arr1[0];
            arr3[index++] = arr2[0];
        }

    }
}
