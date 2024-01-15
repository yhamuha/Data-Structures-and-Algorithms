package lc.heap_priority_queue;

import java.util.PriorityQueue;

public class MinimumCostToConnectSticks {
    public int connectSticks(int[] sticks){
        int cost = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // O(n log n)
        for (int stick : sticks)
            minHeap.add(stick);
        while (minHeap.size() > 1) {
            // O(log n)
            int sum = minHeap.remove() + minHeap.remove();
            cost += sum;
            // O(log n)
            minHeap.add(sum);
        }
        return cost;
    }

    public static void main(String[] args) {
        var mctcs = new MinimumCostToConnectSticks();
        int[] sticks = {2,3,4};
        System.out.println(mctcs.connectSticks(sticks));
    }
}
