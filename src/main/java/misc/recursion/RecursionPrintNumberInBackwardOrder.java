package misc.recursion;

/**
 * The {@code RecursionPrintNumberInBackwardOrder} print
 * all given numbers as digits
 */
public class RecursionPrintNumberInBackwardOrder {

    /**
     * driver method
     * @param args the command line arguments (none)
     */
    public static void main(String[] args) {
        getReversedDigitsAsStr(435);
    }

    /**
     * @param   n       given number
     * @return  String  string of digits separated with commas
     */
    static String _getReversedDigitsAsStr(int n) {
        if (n == 0) return "";
        int digit = n % 10;
        String digitsAsStr = _getReversedDigitsAsStr(n / 10);
        if (digitsAsStr.isEmpty()) return digit + "";
        return digit + ", " + digitsAsStr;
    }

    /**
     * @param n     given number
     * @return      wrapped first condition for n
     */
    static String getReversedDigitsAsStr(int n) {
        if (n == 0) return "0";
        return _getReversedDigitsAsStr(n);
    }
}
