package lc.arraysandhashing.e;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    // O(m+n) O(1)
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char c : magazine.toCharArray())
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (freqMap.containsKey(c) && freqMap.get(c) > 0)
                freqMap.put(c, freqMap.get(c) - 1);
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        RansomNote solution = new RansomNote();
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(solution.canConstruct(ransomNote, magazine));
    }
}
