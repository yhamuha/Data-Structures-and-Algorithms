package misc.problem_solving;

/**
 *
 */
public class ExcelSheetList {
    public static void main(String[] args) {
        String s = "AZZC";
        System.out.println(titleToNumber(s));
    }

    // O(n), O(1)
    // in fact here is translate from base-26 to base-10(DEC)
    static int titleToNumber(String s) {
        int result = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            result = result * 26;
            result += (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
