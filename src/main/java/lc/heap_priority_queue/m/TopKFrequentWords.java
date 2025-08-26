package lc.heap_priority_queue.m;

import java.util.*;

public class TopKFrequentWords {
    // O(n log k) O(n) #ibm
    static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words)
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        PriorityQueue<String> minHeap = new PriorityQueue<>(
                (s1, s2) -> freqMap.get(s1).equals(freqMap.get(s2))
                        ? s2.compareTo(s1)
                        : freqMap.get(s1) - freqMap.get(s2));
        for (String word : freqMap.keySet()) {
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
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        System.out.println(topKFrequent(words, k));
    }
}
