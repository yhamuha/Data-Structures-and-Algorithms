package lc.heap_priority_queue;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        // O(n log n) O(n)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums){
            if (minHeap.size() < k){
                minHeap.offer(num);
            } else if ( num > minHeap.peek()){
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