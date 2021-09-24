package misc.problem_solving;

/**
 *
 */
public class find_number {
    public static void main(String[] args) {
    int[] arr = {5,5,6};
    System.out.println(findNumber(arr));
    }
    //XOR
    static int findNumber(int[] arr) {
        int number = arr[0];
        for (int i = 1; i < arr.length; i++)
            number = number ^ arr[i];
        return number;
    }
}
