package misc.problem_solving;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 */
public class SortSentence {
    public static void main(String[] args) {
        String s = "This1 is2 world4 the3";
        System.out.println(sortSentence(s));
    }

    // O(n), O(n)
    static String sortSentence(String s) {
        String[] words = s.split(" ");
        //Use tree map to order the indexes
        Map<Integer, String> hash = new TreeMap<Integer, String>();
        for(String word : words) {
            Integer index = Integer.valueOf(word.substring(word.length()-1));
            hash.put(index, word.substring(0, word.length()-1));
        }
        //Join the values which are ordered
        return String.join(" ", hash.values());
    }
}
