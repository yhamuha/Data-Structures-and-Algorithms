package misc.m.heapTrie;

import java.util.*;

public class TopKFrequentWords {
    // O(n log k) O(n)
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String word : words)
            map.put(word, 1 + map.getOrDefault(word, 0));
        PriorityQueue<Map.Entry<String, Integer>> pqMin = new PriorityQueue<Map.Entry<String, Integer>>(
                (a, b) -> a.getValue() != b.getValue()  ? a.getValue().compareTo(b.getValue())
                                                        : b.getKey().compareTo(a.getKey())
        );
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pqMin.add(entry);
            if (pqMin.size() > k) pqMin.poll();
        }
        LinkedList<String> result = new LinkedList<String>();
        while (!pqMin.isEmpty())
            result.addFirst(pqMin.poll().getKey());
        return result;
    }

    public static void main(String[] args) {
        TopKFrequentWords solver = new TopKFrequentWords();
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> top = solver.topKFrequent(words, k);
        System.out.println("Top " + k + " frequent words: " + top);
    }
}
