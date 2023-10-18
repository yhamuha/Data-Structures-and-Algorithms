package lc.strings;

public class FirstLetterUppercase {
    public static String firstLetterUppercase (String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                result.append(firstChar).append(word.substring(1)).append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(firstLetterUppercase(str));
    }
}
