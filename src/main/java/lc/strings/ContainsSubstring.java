package lc.strings;

public class ContainsSubstring {
    public static boolean contains(String text, String subtext) {
        return text.indexOf(subtext) != -1;
    }

    public static void main(String[] args) {
        String str = "Never be the same again";
        String substr = "again";
        System.out.println(contains(str, substr));
    }
}
