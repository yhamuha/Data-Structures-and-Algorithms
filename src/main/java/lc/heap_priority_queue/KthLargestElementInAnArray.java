package lc.heap_priority_queue;

import java.util.PriorityQueue;
import java.util.Queue;

/*
 return the kth largest element in the array
 */
public class KthLargestElementInAnArray {
    // O(n * log k)
    // n - quantity of elements
    // k - value
    public int findKthLargest(int[] nums, int k) {
        // create pq with init capacity
        Queue<Integer> minHeap = new PriorityQueue<>(k);

        for(int num : nums) {
            if (minHeap.size() < k)
                minHeap.add(num);
            else if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(num);
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        var klarg = new KthLargestElementInAnArray();
        System.out.println(klarg.findKthLargest(new int[]{3,2,1,5,6,4},2));
    }
}