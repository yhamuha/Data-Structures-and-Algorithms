package misc.cs.RECURSION;

/**
 *
 */
public class DigitSum {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(digitsSum(n));
    }

    static int digitsSum(int n) {
        if (n == 0) return 0;
        int digitsSum_except_last = digitsSum(n / 10);
        int currentDigit = n % 10;
        return digitsSum_except_last + currentDigit;
    }
}
