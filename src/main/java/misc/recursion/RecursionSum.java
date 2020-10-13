package misc.recursion;

public class RecursionSum {
    public static void main(String[] args) {
        System.out.println(digitsSum(457));
    }

    static int digitsSum(int n) {
        if (n == 0) return 0;
        int digitsSum_except_last = digitsSum(n / 10);
        int currentDigit = n % 10;
        return digitsSum_except_last + currentDigit;
    }
}
