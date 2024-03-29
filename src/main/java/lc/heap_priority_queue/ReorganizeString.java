package lc.heap_priority_queue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {
    // O(n log n) O(n)
    public String reorganizeString(String s) {
        // TC: O(n)
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        // TC: O(n)
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b)->(map.get(b)-map.get(a)));
        maxHeap.addAll(map.keySet()); // SC: O(n log n)
        StringBuilder sb = new StringBuilder();
        // reorganize string SC: O(n log n)
        while(maxHeap.size() > 1){              // control to have a pairs in maxHeap
            char first = maxHeap.poll();
            char second = maxHeap.poll();
            sb.append(first);
            sb.append(second);
            map.put(first,map.get(first)-1);
            map.put(second,map.get(second)-1);
            if (map.get(first) > 0)
                maxHeap.offer(first);
            if (map.get(second) > 0)
                maxHeap.offer(second);
        }
        if(!maxHeap.isEmpty()){                 // have only 1 element in heap
            if(map.get(maxHeap.peek())>1)       // we have more than 1 adjacent and must return empty String
                return "";
            else
                sb.append(maxHeap.poll());      // otherwise add the last char
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        var rs = new ReorganizeString();
        String s = "aab";
        System.out.println(rs.reorganizeString(s));
    }
}
