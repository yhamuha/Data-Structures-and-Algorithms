package misc.problem_solving;

/**
 *
 */
public class StringHalvesVowelAlike {
    public static void main(String[] args) {
        String s = "AabCdEefGh";
        System.out.println(halvesAreAlike(s));
    }

    // O(n/2)
    static boolean halvesAreAlike(String s) {

        // check for even
        if (s.length()%2 != 0) return false;

        int n = s.length();

        String vowels = "aeiouAEIOU";
        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2, n);

        int aVowelCount = 0;
        for (char c : a.toCharArray()) {
            // if char non exists - return -1
            if (vowels.indexOf(c) != -1) {
                aVowelCount++;
            }
        }

        int bVowelCount = 0;
        for (char c : b.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                bVowelCount++;
            }
        }

        return aVowelCount == bVowelCount;
    }
}
