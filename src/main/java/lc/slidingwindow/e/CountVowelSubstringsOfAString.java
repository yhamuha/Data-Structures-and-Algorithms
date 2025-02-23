package lc.slidingwindow.e;

import java.util.HashMap;
import java.util.Map;

public class CountVowelSubstringsOfAString {
    // O(n) O(n)
    public int countVowelSubstrings(String word) {
        int res = 0;
        int l = 0;
        int r = 0;
        int m = 0;
        Map<Character, Integer> vowelMap = new HashMap<>();
        while (r < word.length()) {
            char c = word.charAt(r);
            r++;
            if (!isVowel(c)) {
                l = r;
                m = l;
                vowelMap.clear();
                continue;
            }
            vowelMap.put(c, vowelMap.getOrDefault(c, 0) + 1);
            while (vowelMap.size() == 5) {
                char lc = word.charAt(m);
                m++;
                vowelMap.put(lc, vowelMap.get(lc) - 1);
                if (vowelMap.get(lc) == 0)
                    vowelMap.remove(lc);
            }
            res += m - l;
        }
        return res;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        CountVowelSubstringsOfAString solution = new CountVowelSubstringsOfAString();
        String word = "cuaieuouac";
        System.out.println(solution.countVowelSubstrings(word));
    }
}
