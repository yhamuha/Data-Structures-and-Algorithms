package lc.heap_priority_queue;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class UglyNumberII {
    int[] factors = {2, 3, 5};
    public int nthUglyNumber(int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> seen = new HashSet<>();
        pq.offer(1);
        seen.add(1);
        for (int i = 0; i < n - 1; i++) {
            int core = pq.poll();
            for (int f: factors) {
                if (core <= (Integer.MAX_VALUE / f) && seen.add(core * f))
                    pq.offer(core * f);
            }
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        var unII = new UglyNumberII();
        int n = 10;
        System.out.println(unII.nthUglyNumber(n));
    }
}
