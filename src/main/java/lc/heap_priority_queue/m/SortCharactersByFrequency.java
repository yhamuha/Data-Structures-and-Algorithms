package lc.heap_priority_queue.m;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    // O(n log n) O(n)
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char str : s.toCharArray())
            map.put(str, map.getOrDefault(str,0)+1);
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> (map.get(b))- (map.get(a)));
        maxHeap.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while(!maxHeap.isEmpty()){
            char c = maxHeap.poll();
            for(int i=0; i<map.get(c); i++)
                sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        var scbf = new SortCharactersByFrequency();
        String s = "tree";
        System.out.println(scbf.frequencySort(s));
    }
}
