package lc.slidingwindow.e;

import java.util.HashMap;
import java.util.Map;

public class CountVowelSubstringsOfAString {
    // O(n) O(n)
    static int countVowelSubstrings(String word) {
        int res = 0;
        int left = 0;
        int right = 0;
        int middle = 0;
        Map<Character, Integer> vowelMap = new HashMap<>();
        while (right < word.length()) {
            char c = word.charAt(right);
            right++;
            if (!isVowel(c)) {
                left = right;
                middle = left;
                vowelMap.clear();
                continue;
            }
            vowelMap.put(c, vowelMap.getOrDefault(c, 0) + 1);
            while (vowelMap.size() == 5) {
                char lc = word.charAt(middle);
                middle++;
                vowelMap.put(lc, vowelMap.get(lc) - 1);
                if (vowelMap.get(lc) == 0)
                    vowelMap.remove(lc);
            }
            res += middle - left;
        }
        return res;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        String word = "cuaieuouac";
        System.out.println(countVowelSubstrings(word));
    }
}
