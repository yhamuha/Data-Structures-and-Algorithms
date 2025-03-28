package lc.heap_priority_queue.e;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TakeGiftsFromTheRichestPile {
    // O(n log n) O(n)
    static long pickGifts(int[] gifts, int k) {
        long ans = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return Integer.compare(b, a);
            }
        });
        for (int i = 0; i < gifts.length; i++)
            maxHeap.add(gifts[i]);
        for (int i = 0; i < k; i++) {
            int val = maxHeap.poll();
            int y = (int) Math.floor(Math.sqrt(val));
            maxHeap.add(y);
        }
        while (maxHeap.size() != 0)
            ans = ans + maxHeap.poll();
        return ans;
    }

    public static void main(String[] args) {
        int[] gifts = {25, 64, 9, 4, 100};
        int k = 4;
        System.out.println(pickGifts(gifts, k));
    }
}
