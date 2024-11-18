package lc.arraysandhashing.e;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {
    // O(n) O(1)
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return Math.min(Math.min(map.getOrDefault('b', 0), map.getOrDefault('a', 0)),
                Math.min(map.getOrDefault('l', 0) / 2,
                        Math.min(map.getOrDefault('o', 0) / 2,
                                map.getOrDefault('n', 0))));
    }

    public static void main(String[] args) {
        MaximumNumberOfBalloons solution = new MaximumNumberOfBalloons();
        String input = "nlaebolko";
        System.out.println(solution.maxNumberOfBalloons(input));
    }
}
