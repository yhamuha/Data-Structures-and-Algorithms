package misc.problem_solving;

/**
 *
 */
public class swap_arrays {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,1,2,3,4};
        int[] arr2 = {1,2,3,4,1,2,3,8};
        int[] arr3 = new int[10];

        for (int i=0; i<arr.length; i++) {
                arr3[i] = arr[i];
            }
        for (int i=0; i<arr.length; i++) {
                arr[i] = arr2[i];
            }
        for (int i=0; i<arr.length; i++) {
                arr2[i] = arr3[i];
            }
        for (int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i=0; i< arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
