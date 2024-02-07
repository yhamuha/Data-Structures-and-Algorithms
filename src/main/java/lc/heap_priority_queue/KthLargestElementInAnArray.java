package lc.heap_priority_queue;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 return the kth largest element in the array
 */
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        // SC: O(n)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // TC: (O n log n)
        for(int num : nums) {
            if (minHeap.size() < k) {
                minHeap.offer(num);
            } else if ( num > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(num);
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        var klarg = new KthLargestElementInAnArray();
        System.out.println(klarg.findKthLargest(new int[]{3,2,1,5,6,4},2));
    }
}