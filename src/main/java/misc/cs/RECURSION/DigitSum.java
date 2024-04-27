package misc.cs.RECURSION;

public class DigitSum {
    // O(log n) O(log n)
    static int digitsSum(int n) {
        if (n == 0) return 0;
        int digitsSum_except_last = digitsSum(n / 10);
        int currentDigit = n % 10;
        return digitsSum_except_last + currentDigit;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(digitsSum(n));
    }

}
