package lc.heap_priority_queue;

import java.util.*;

public class TopKFrequentElements {
    // O(n log n + k log n)
    public List<Integer> topKFrequent(int[] nums, int k) {
        // O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        // O (n)
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            // O (log n)
            maxHeap.add(entry);
        }

        List<Integer> res = new ArrayList<>();
        // O(k)
        while(res.size()<k){
            // O (log n)
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }
        return res;
    }

    public static void main(String[] args) {
        var tkfe = new TopKFrequentElements();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(tkfe.topKFrequent(nums, k));
    }
}
