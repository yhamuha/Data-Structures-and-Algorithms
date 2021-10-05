package misc.problem_solving;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class MorseCode {
    public static void main(String[] args) {
        String[] words = {"gin","zen"};
        System.out.println(uniqueMorseRepresentations(words));
    }

    static int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray())
                code.append(MORSE[c - 'a']);
            seen.add(code.toString());
        }

        return seen.size();
    }
}
