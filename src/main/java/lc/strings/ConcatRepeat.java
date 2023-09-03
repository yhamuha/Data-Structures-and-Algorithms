package lc.strings;

public class ConcatRepeat {
    public static String concatRepeat(String str, int n) {
        StringBuilder sb = new StringBuilder(str.length() * n);
        for (int i = 1; i <= n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "some string";
        int n = 5;
        System.out.println(concatRepeat(str, n));
    }
}
