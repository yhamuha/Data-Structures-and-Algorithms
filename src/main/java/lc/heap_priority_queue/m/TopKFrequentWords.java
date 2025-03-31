package lc.heap_priority_queue.m;

import java.util.*;

public class TopKFrequentWords {
    // O(n log k) O(n)
    static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);
        PriorityQueue<String> minHeap = new PriorityQueue<>(
                (s1, s2) -> map.get(s1).equals(map.get(s2))
                            ? s2.compareTo(s1)
                            : map.get(s1) - map.get(s2));
        for (String word : map.keySet()) {
            minHeap.offer(word);
            if (minHeap.size() > k)
                minHeap.poll();
        }
        List<String> toReturn = new ArrayList<>();
        while (!minHeap.isEmpty())
            toReturn.add(minHeap.poll());
        Collections.reverse(toReturn);
        return toReturn;
    }

    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        System.out.println(topKFrequent(words, k));
    }
}
