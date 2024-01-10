package lc.heap_priority_queue;

import java.util.*;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        // O(n) count up all occurrences of each word
        HashMap<String, Integer> wordCounts = new HashMap<>();
        for(String word : words)
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        // define comparator for heap
        Comparator<String> wordComparator = (s1, s2) -> {
            return wordCounts.get(s1) == wordCounts.get(s2) ? s2.compareTo(s1)
                                                            : wordCounts.get(s1) - wordCounts.get(s2);
        };
        // minHeap: lowest occurrences always on the top
        PriorityQueue<String> minHeap = new PriorityQueue<>(wordComparator);
        // O(n log k) fill in heap up to k
        for(String word : wordCounts.keySet()) {
            minHeap.offer(word);
            if(minHeap.size() > k) minHeap.poll();
        }

        LinkedList<String> toReturn = new LinkedList<>();
        // O (k log k) as polling elements from the heap
        // fill in List

        while (!minHeap.isEmpty())
            toReturn.addFirst(minHeap.poll());

        return toReturn;
    }

    public static void main(String[] args) {
        TopKFrequentWords tkfw = new TopKFrequentWords();
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        System.out.println(tkfw.topKFrequent(words, k));
    }
}
