package lc.arraysandhashing.e;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        // O(n^2) O(1)
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        int ans = -1;
        for (Map.Entry<Character, Integer> en : map.entrySet()) {
            if (en.getValue() == 1) {
                char uniq = en.getKey();
                int idx = s.indexOf(uniq);
                if(ans == -1 || idx < ans){
                    ans = idx;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString solution = new FirstUniqueCharacterInAString();
        String input = "loveleetcode";
        System.out.println(solution.firstUniqChar(input));
    }
}
