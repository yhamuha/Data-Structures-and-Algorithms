package misc.computerVision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 */
public class Main {

    // O(n)
    static String getAnyWord(int candidateStart, String str, HashSet<String> words) {
        for (String word : words) {
            int candidateEnd = candidateStart + word.length() - 1;

            if (str.charAt(candidateStart) == word.charAt(0) && candidateEnd < str.length()) {
                String candidate = str.substring(candidateStart, candidateEnd + 1);
                if (word.equals(candidate)) return candidate;
            }
        }
        return null;
    }

    // O(n)
    static String parseStr(String str, HashSet<String> words) {
        ArrayList<String> parsedWords = new ArrayList<>();
        int windowStart = 0;
        int windowEnd = 0;
        while (windowEnd < str.length()) {
            String candidate = getAnyWord(windowEnd, str, words);
            if (candidate == null) {
                windowEnd++;
            } else {
                if (windowStart != windowEnd)
                    parsedWords.add(str.substring(windowStart, windowEnd));
                parsedWords.add(candidate);
                windowEnd += candidate.length();
                windowStart = windowEnd;
            }
        }
        if (windowStart < windowEnd)
            parsedWords.add(str.substring(windowStart));
        return String.join(" ", parsedWords);
    }

    //
    static String shortestSubString(String str, HashSet<Character> letters) {
        String shortestStr = null;
        int windowStart = 0, windowEnd = 0;
        HashMap<Character, Integer> windowLetters = new HashMap<>();
        while (windowEnd < str.length()) {
            char letter = str.charAt(windowEnd);
            if (letters.contains(letter)) windowLetters.put(letter, windowLetters.getOrDefault(letter, 0) + 1);
            if (windowLetters.size() == letters.size()) {
                while (windowLetters.size() == letters.size()) {
                    char candidateLetter = str.charAt(windowStart);
                    if (windowLetters.containsKey(candidateLetter)) {
                        int candidateLetterCount = windowLetters.get(candidateLetter) - 1;
                        if (candidateLetterCount == 0) windowLetters.remove(candidateLetter);
                        else windowLetters.put(candidateLetter, candidateLetterCount);
                    } windowStart++;
                } String currStr =
                        str.substring(windowStart - 1, windowEnd + 1);
                if (shortestStr == null || currStr.length() < shortestStr.length()) shortestStr = currStr;
            } windowEnd++;
        } return shortestStr;
    }

    public static void main(String[] args) {
        MaxSum ms = new MaxSum(0,0,0);
        SubMatrix sm = new SubMatrix(0,0,0,0,0);
//        int[] arr = {2,3,4,5,-90,7};
//        System.out.println(ms.getMaxSumRange(arr).toString());

//        int[][] arr_2d = {{1,2,-3},{4,-5,6},{7,8,9}};
//        System.out.println(sm.getMaxSumMatrix(arr_2d).toString());

        String str = "AGHGVJHGVBJHGVCKHBABYC";
        HashSet letters = new HashSet();
        letters.add("ABC");

//        System.out.println(getAnyWord(16, str, words));
//        System.out.println(parseStr(str, words));
        System.out.println(shortestSubString(str, letters));
    }
}
