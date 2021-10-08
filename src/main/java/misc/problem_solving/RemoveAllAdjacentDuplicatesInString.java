package misc.problem_solving;

import java.util.HashSet;

/**
 *
 */
public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }

    // O(n^2), O(n)
    static String removeDuplicates(String S) {
        // generate 26 possible duplicates
        HashSet<String> duplicates = new HashSet();
        StringBuilder sb = new StringBuilder();
        for(char i = 'a'; i <= 'z'; ++i) {
            sb.setLength(0);
            sb.append(i); sb.append(i);
            duplicates.add(sb.toString());
        }

        int prevLength = -1;
        while (prevLength != S.length()) {
            prevLength = S.length();
            for (String d : duplicates)
                S = S.replace(d, "");
        }

        return S;
    }
}
