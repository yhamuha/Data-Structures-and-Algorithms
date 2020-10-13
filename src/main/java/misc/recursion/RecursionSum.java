package misc.recursion;
/**
 *  The {@code RecursionSum} class calculate
 *  each number of sum from given string number
 *
 *  It includes methods for generation Fibonacci number.
 *
 */
public class RecursionSum {

    /**
     * driver method
     * @param args the command-line arguments (none)
     */
    public static void main(String[] args) {
        System.out.println(digitsSum(123));
    }

    /**
     * find sum of each digits
     * recursively approach
     * @param n         input number
     * @return int      sum of all digits
     */
    static int digitsSum (int n) {

        // minimal base case
        if (n == 0) return 0;

        // min size task,
        // will create area stacks included unique n value
        // for each step
        int digitsSumExceptLast = digitsSum(n / 10);

        // current size task
        int currentDigit = n % 10;

        return digitsSumExceptLast + currentDigit;
    }
}


