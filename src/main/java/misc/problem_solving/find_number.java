package misc.problem_solving;

/**
 *
 */
public class find_number {
    public static void main(String[] args) {
    int[] arr = {5,5,6};
    System.out.println(findNumber(arr));

    int a = 29;
    int b = 15;

    System.out.println(countBits(a,b));

    }
    //XOR
    static int findNumber(int[] arr) {
        int number = arr[0];
        for (int i = 1; i < arr.length; i++)
            number = number ^ arr[i];
        return number;
    }

    // XOR will return "1" for the different bits
    static int countBits(int a, int b) {
        int diffBits = a ^ b;
        int onesCount = 0;
        while (diffBits != 0) {
            // using >>> counting "1"
            if ((diffBits & 1) == 1) onesCount++;
            diffBits = diffBits >>> 1;
        }
        return onesCount;
    }
}
