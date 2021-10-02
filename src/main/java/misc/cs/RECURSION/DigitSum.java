package misc.cs.RECURSION;

/**
 *
 */
public class DigitSum {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(digitsSum(n));
        int f = 5;
        System.out.println(factorial(f));
    }

    static int digitsSum(int n) {
        if (n == 0) return 0;
        int digitsSum_except_last = digitsSum(n / 10);
        int currentDigit = n % 10;
        return digitsSum_except_last + currentDigit;
    }

    static int factorial(int f) {
        if (f == 0) return 1;
        else return factorial(f - 1) * f;
    }
}
