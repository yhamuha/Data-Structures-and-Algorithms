package lc.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
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