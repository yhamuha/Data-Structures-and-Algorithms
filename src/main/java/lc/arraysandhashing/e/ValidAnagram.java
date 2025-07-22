package lc.arraysandhashing.e;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    // O(n log n) O(n)
    public static boolean isAnagramBySorting(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    // O(n) O(1)
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] characters = new int[256]; // ASCII
        for (int i = 0; i < s.length(); i++) {
            characters[s.charAt(i) - 'a']++;
            characters[t.charAt(i) - 'a']--;
        }
        for (int j = 0; j < characters.length; j++)
            if (characters[j] != 0) return false;
        return true;
    }

    // O(n) O(n)
    public static boolean isAnagram_hash(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char ch : chars)
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        for (char ch : t.toCharArray()) {
            if (map.containsKey(ch))
                map.put(ch, map.get(ch) - 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "str";
        String t = "rst";
        System.out.println(isAnagram(s, t));
    }
}

