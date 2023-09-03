package lc.strings;

public class HasOnlySubstrings {
    public static boolean hasOnlySubstrings(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() / 2; i++) {
            sb.append(str.charAt(i));
            String resultStr = str.replaceAll(sb.toString(), "");
            if (resultStr.length() == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "str str";
        System.out.println(hasOnlySubstrings(str));
    }
}
