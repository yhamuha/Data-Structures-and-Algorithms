package lc.slidingwindow.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    // O(n) O(1)
    static List<Integer> findAnagrams(String s, String p) {
        List<Integer> answerList = new ArrayList<>();
        if (p.length() > s.length())
            return answerList;
        int[] pFreq = new int[26];
        int[] sFreq = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pFreq[p.charAt(i) - 'a']++;
            sFreq[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pFreq, sFreq))
            answerList.add(0);
        int i = 0, j = p.length();
        while (j < s.length()) {
            sFreq[s.charAt(i) - 'a']--;
            sFreq[s.charAt(j) - 'a']++;
            i++;
            if (Arrays.equals(sFreq, pFreq))
                answerList.add(i);
            j++;
        }
        return answerList;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }
}
