package lc.heap_priority_queue.m;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {
    // O(n log m) O(m)
    public String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        PriorityQueue<Character> maxHeap = new PriorityQueue((a,b)->(map.get(b)-map.get(a)));
        StringBuilder sb = new StringBuilder();
        maxHeap.addAll(map.keySet());
        while(maxHeap.size()>1){
            char first = maxHeap.poll();
            char second = maxHeap.poll();
            sb.append(first);
            sb.append(second);
            map.put(first, map.get(first)-1);
            map.put(second, map.get(second)-1);
            if (map.get(first) > 0)
                maxHeap.offer(first);
            if (map.get(second) > 0)
                maxHeap.offer(second);
        }
        if(!maxHeap.isEmpty()){
            if(map.get(maxHeap.peek())>1)
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
