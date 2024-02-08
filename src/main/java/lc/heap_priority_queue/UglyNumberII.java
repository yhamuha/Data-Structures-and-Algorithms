package lc.heap_priority_queue;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class UglyNumberII {
    // O(n log n) O(n)
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        minHeap.add(1L);
        n = n - 1;
        while (n > 0) {
            long a = minHeap.poll();
            if (!minHeap.contains(a*2))
                minHeap.add(a*2);
            if (!minHeap.contains(a*3))
                minHeap.add(a*3);
            if (!minHeap.contains(a*5))
                minHeap.add(a*5);
            n--;
        }
        long result = minHeap.poll();
        return (int)result;
    }

    public static void main(String[] args) {
        var unII = new UglyNumberII();
        int n = 10;
        System.out.println(unII.nthUglyNumber(n));
    }
}
