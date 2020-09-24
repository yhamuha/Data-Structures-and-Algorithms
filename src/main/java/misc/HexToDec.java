package misc;

public class HexToDec {
    public static void main(String[] args) {
        System.out.println(hex2decimal("111"));
    }

    public static int hex2decimal(String s) {
        // hex digits template
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }
}
