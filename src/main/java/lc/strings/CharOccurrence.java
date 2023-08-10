package lc.strings;

public class CharOccurrence {

    public static int countOccurrencesOfACertainCharacter_lang(
            String str, char ch) {
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }

    public static int countOccurrencesOfACertainCharacter_pure(
            String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static long countOccurrencesOfACertainCharacter_func(
            String str, char ch) {
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }

    public static void main(String[] args) {
        String str = "Cooperation";
        char ch = 'o';
        System.out.println(countOccurrencesOfACertainCharacter_lang(str,ch));
        System.out.println(countOccurrencesOfACertainCharacter_pure(str, ch));
        System.out.println(countOccurrencesOfACertainCharacter_func(str, ch));
    }
}
