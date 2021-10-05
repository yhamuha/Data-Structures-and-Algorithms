package misc.problem_solving;

/**
 *
 */
public class TwoStringArraysEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"ab", "ac"};
        System.out.println(arrayStringsAreEqual2(word1, word2));
    }

    // O(n) O(n)
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i=0;i<word1.length;i++) {
            sb.append(word1[i]);
        }

        for(int j=0;j<word2.length;j++) {
            sb2.append(word2[j]);
        }


        return sb.toString().equals(sb2.toString());

    }

    // solution without StringBuilder
    static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";

        for (String s : word1) s1 += s;
        for (String t : word2) s2 += t;

        return (s1.equals(s2));
    }
}
