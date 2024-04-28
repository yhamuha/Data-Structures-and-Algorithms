package misc.recursion;

public class RecursionPrintNumberInBackwardOrder {
    // O(log n) O(log n)
    static String getReversedDigitsAsStr(int n) {
        if (n == 0) return "0";
        return _getReversedDigitsAsStr(n);
    }

    static String _getReversedDigitsAsStr(int n) {
        if (n == 0) return "";
        int digit = n % 10;
        String digitsAsStr = _getReversedDigitsAsStr(n / 10);
        if (digitsAsStr.isEmpty()) return digit + "";
        return digit + ", " + digitsAsStr;
    }

    public static void main(String[] args) {
        System.out.println(getReversedDigitsAsStr(435));
    }
}
