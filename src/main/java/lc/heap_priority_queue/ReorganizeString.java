package lc.heap_priority_queue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {
    public String reorganizeString(String s) {
        // O(n)
        Map<Character, Integer> freq_map = new HashMap<>();
        for (char c: s.toCharArray()) {
            freq_map.put(c, freq_map.getOrDefault(c, 0) + 1);
        }
        // O(k log k)
        // k - numbers of unique characters in input string
        PriorityQueue<Character> maxheap = new PriorityQueue<>(
                (a, b) -> freq_map.get(b) - freq_map.get(a)
        );
        maxheap.addAll(freq_map.keySet());
        // O(n log k)
        // n - input str; k - unique chars
        StringBuilder sb = new StringBuilder();
        while (maxheap.size() > 1) {
            char first = maxheap.poll();
            char second = maxheap.poll();
            sb.append(first);
            sb.append(second);
            freq_map.put(first, freq_map.get(first) - 1);
            freq_map.put(second, freq_map.get(second) - 1);
            if (freq_map.get(first) > 0)
                maxheap.offer(first);
            if (freq_map.get(second) > 0)
                maxheap.offer(second);
        }
        if (!maxheap.isEmpty()) {
            if (freq_map.get(maxheap.peek()) > 1)
                return "";
            else
                sb.append(maxheap.poll());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        var rs = new ReorganizeString();
        String s = "aab";
        System.out.println(rs.reorganizeString(s));
    }
}
