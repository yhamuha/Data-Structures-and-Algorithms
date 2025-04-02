package lc.heap_priority_queue.m;

import java.util.PriorityQueue;

public class MinimumCostToConnectSticks {
    // O(n log n) O(n)
    static int connectSticks(int[] sticks){
        int cost = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int stick : sticks)
            minHeap.add(stick);
        while (minHeap.size() > 1) {
            int sum = minHeap.poll() + minHeap.poll();
            cost += sum;
            minHeap.add(sum);
        }
        return cost;
    }

    public static void main(String[] args) {
        int[] sticks = {1,8,3,5};
        System.out.println(connectSticks(sticks));
    }
}
