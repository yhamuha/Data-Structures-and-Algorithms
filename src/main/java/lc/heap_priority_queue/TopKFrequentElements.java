package lc.heap_priority_queue;

import java.util.*;

public class TopKFrequentElements {
    // O(n log n + k log n)
    public int[] topKFrequent(int[] nums, int k) {
        // O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        // maxHeap; sort by value
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        // O (n)
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            // O (log n)
            maxHeap.add(entry);
        }

        int[] result = new int[k];
        int index = 0;
        // O(k)
        while(index < k){
            // O (log n)
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            result[index] = entry.getKey();
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        var tkfe = new TopKFrequentElements();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(tkfe.topKFrequent(nums, k)));
    }
}
