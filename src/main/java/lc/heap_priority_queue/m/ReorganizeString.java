package lc.heap_priority_queue.m;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {
    // O(n log n) O(n)
    public String reorganizeString(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char c : s.toCharArray())
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        PriorityQueue<Character> maxHeap = new PriorityQueue((a,b)->(freqMap.get(b)-freqMap.get(a)));
        StringBuilder sb = new StringBuilder();
        maxHeap.addAll(freqMap.keySet());
        while(maxHeap.size()>1){
            char first = maxHeap.poll();
            char second = maxHeap.poll();
            sb.append(first);
            sb.append(second);
            freqMap.put(first, freqMap.get(first)-1);
            freqMap.put(second, freqMap.get(second)-1);
            if (freqMap.get(first) > 0)
                maxHeap.offer(first);
            if (freqMap.get(second) > 0)
                maxHeap.offer(second);
        }
        if(!maxHeap.isEmpty()){
            if(freqMap.get(maxHeap.peek())>1)
                return "";
            else
                sb.append(maxHeap.poll());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        var rs = new ReorganizeString();
        String s = "aab";
        System.out.println(rs.reorganizeString(s));
    }
}
