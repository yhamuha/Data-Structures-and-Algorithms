package lc.strings;

import java.util.Arrays;

public class RemoveLetterToEqualizeFrequency {
    // O(n) O(1)
    public boolean equalFrequency(String word) {
        int[] alphabet = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            alphabet[c - 'a']++;
        }
        Arrays.sort(alphabet);
        int i = 0;
        while (i < 26 && alphabet[i] == 0) {
            i++;
        }
        return i == 25
                || alphabet[i] == 1 && alphabet[i + 1] == alphabet[25]
                || alphabet[i] == alphabet[24] && alphabet[25] == alphabet[24] + 1;
    }
    public static void main(String[] args) {
        RemoveLetterToEqualizeFrequency obj = new RemoveLetterToEqualizeFrequency();
        System.out.println(obj.equalFrequency("hello"));
    }
}

