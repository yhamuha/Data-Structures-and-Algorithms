package misc.problem_solving;

/**
 *
 */
public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "xyzz";
        System.out.println(mergeAlternately(word1, word2));
    }

    //
    static String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();

        if (word1.length() < word2.length()) {

            for (int i = 0; i < word1.length(); i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            if (word1.length() < word2.length()) {
                sb.append(word2.substring(word1.length(), word2.length()));
            } else {
                sb.append(word1.substring(word2.length(), word1.length()));
            }
        } else {
            for (int i = 0; i < word2.length(); i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }

            if (word1.length() < word2.length()) {
                sb.append(word2.substring(word1.length(), word2.length()));
            } else {
                sb.append(word1.substring(word2.length(), word1.length()));
            }
        }
        return sb.toString();
    }

}
