package lc.strings;

public class RemoveWhitespaces {

    public static String removeWhitespaces (String str) {
        return str.replaceAll("\\s", "");
    }

    public static boolean isWhitespaces (String str) {

        return str.contains(" ");
    }

    public static void main(String[] args) {
        String str = " some    gap ";
        System.out.println(isWhitespaces(str));
        System.out.println(removeWhitespaces(str));

        String str_w = "nowhitespaces";
        System.out.println(isWhitespaces(str_w));
    }

}
