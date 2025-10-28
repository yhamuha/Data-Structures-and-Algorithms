package lc.heap_priority_queue.m;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FindKClosestElements {
    // O(n log k) O(k) #1
    static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int integer : arr) {
            if (k > 0) {
                minHeap.offer(integer);
                k--;
            } else if (Math.abs(minHeap.peek() - x) > Math.abs(integer - x)) {
                minHeap.poll();
                minHeap.offer(integer);
            }
        }
        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty())
            result.add(minHeap.poll());
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 4;
        int x = 3;
        System.out.println(findClosestElements(arr, k, x));
    }
}
