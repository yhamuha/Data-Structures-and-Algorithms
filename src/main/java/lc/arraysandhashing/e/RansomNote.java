package lc.arraysandhashing.e;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    // O(m+n) O(1)
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (!map.containsKey(c))
                map.put(c, 1);
            else
                map.put(c, map.get(c) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (map.containsKey(c) && map.get(c) > 0)
                map.put(c, map.get(c) - 1);
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
