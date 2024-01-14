package lc.heap_priority_queue;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        HashMap<Character, Integer> cnt = new HashMap<>();
        for (char c: s.toCharArray()) {
            cnt.put(c, cnt.getOrDefault(c, 0) + 1);
        }
        // O (n log k); k - number of unique in String
        PriorityQueue<Character> heap = new PriorityQueue<>((a, b) -> (cnt.get(b) - cnt.get(a)));
        heap.addAll(cnt.keySet());
        // O (n log k); n == s.length, k - unique chars in s
        StringBuilder sb = new StringBuilder();
        while (!heap.isEmpty()) {
            char c = heap.poll();
            for (int i = 0; i < cnt.get(c); i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        var scbf = new SortCharactersByFrequency();
        String s = "tree";
        System.out.println(scbf.frequencySort(s));
    }
}
