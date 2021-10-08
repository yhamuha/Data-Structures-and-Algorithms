package misc.problem_solving;

/**
 *
 */
public class MaximumNumberOfWordsYouCanType {
    public static void main(String[] args) {
        String text = "hello world";
        String brokenLetters = "ad";
        System.out.println(canBeTypedWords2(text, brokenLetters));
    }

    // without hashmap; O(1)
    static int canBeTypedWords2(String text, String brokenLetters) {
        int[] lookup = new int[26];
        int c = 0;
        for (char ch : brokenLetters.toCharArray()) {
            // lookup broken letters
            lookup[ch - 'a']++;
        }

        String[] arr = text.split(" ");

        for (String w : arr) {
            boolean fl = true;
            for (char ch : w.toCharArray()) {
                // if letter is present in lookup array
                if (lookup[ch - 'a'] > 0) {
                    // then do not count this word
                    fl = false;
                    break;
                }
            }
            // otherwise if word without broken letter
            // increase counter
            if (fl) c++;
        }

        return c;
    }

}
