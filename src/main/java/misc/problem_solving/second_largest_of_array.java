package misc.problem_solving;

/**
 *
 */
public class second_largest_of_array {
    public static void main(String[] args) {

        int[] arr = {5,50,34,1,6,56,82,43,101};
        int small = arr[0], large = arr[0];
        int s_small = -1, s_large = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                s_small = small;
                small = arr[i];
            }
            if (arr[i] >  large) {
                s_large = large;
                large = arr[i];
            }
        }
        System.out.println(s_small + " " + s_large);
    }
}
