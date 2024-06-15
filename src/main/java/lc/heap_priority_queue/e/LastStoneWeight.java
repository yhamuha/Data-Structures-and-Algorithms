package lc.heap_priority_queue.e;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        // O(n log n) O(n)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones)
            maxHeap.offer(stone);
        while(maxHeap.size() > 1){
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if(x!=y)
                maxHeap.offer(Math.abs(y-x));
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
    public static void main(String[] args) {
        var lsw = new LastStoneWeight();
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lsw.lastStoneWeight(stones));
    }
}
