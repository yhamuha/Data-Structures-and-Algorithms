package lc.strings;

public class IsDigit {

    public static boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsOnlyDigitsFunc(String str) {
        return !str.chars()
                .anyMatch(n -> !Character.isDigit(n));
    }


    public static void main(String[] args) {
        String str = "123";
        System.out.println(containsOnlyDigits(str));
        System.out.println(containsOnlyDigitsFunc(str));
    }
}
