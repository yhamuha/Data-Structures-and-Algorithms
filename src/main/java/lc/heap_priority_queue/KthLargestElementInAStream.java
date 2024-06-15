package lc.heap_priority_queue;

import java.util.PriorityQueue;

public class KthLargestElementInAStream {
    // O(n log n) O(n)
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int k;
    public void KthLargestElementInAStream (int k, int[] nums){
        this.k = k;
        for(int num : nums){
            add(num);
        }
    }
    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > k){
            minHeap.poll();
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {4,5,8,2};
        KthLargestElementInAStream kleis = new KthLargestElementInAStream();
        kleis.KthLargestElementInAStream(3, new int[] {4,5,8,2});
        System.out.println(kleis.add(3));
        System.out.println(kleis.add(5));
        System.out.println(kleis.add(10));
        System.out.println(kleis.add(9));
        System.out.println(kleis.add(4));
        System.out.println("Final heap values: " + kleis.minHeap);
    }
}
