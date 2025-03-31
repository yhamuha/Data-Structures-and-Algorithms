package lc.heap_priority_queue.m;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    // O(n log m) O(m)
    static String frequencySort(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char str : s.toCharArray())
            freqMap.put(str, freqMap.getOrDefault(str,0)+1);
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> (freqMap.get(b))- (freqMap.get(a)));
        maxHeap.addAll(freqMap.keySet());
        StringBuilder sb = new StringBuilder();
        while(!maxHeap.isEmpty()){
            char c = maxHeap.poll();
            for(int i=0; i<freqMap.get(c); i++)
                sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
