package lc.heap_priority_queue.m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class FindKClosestElements {
    // O(n log k) O(k)
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
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
    // O(n log k + k log k) O(k)
    public List<Integer> findClosestElements_l(int[] arr, int k, int x) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> {
            int firstDiff = Math.abs(a - x);
            int secondDiff = Math.abs(b - x);
            return (firstDiff == secondDiff) ? b - a : secondDiff - firstDiff;
        });
        for (int key : arr) {
            heap.add(key);
            if (heap.size() > k)
                heap.remove();
        }
        List<Integer> ans = new ArrayList<>();
        while (!heap.isEmpty())
            ans.add(heap.remove());
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        FindKClosestElements finder = new FindKClosestElements();
        int[] arr = {-1,1,3,4};
        int k = 2;
        int x = 3;
        List<Integer> closestElements = finder.findClosestElements_l(arr, k, x);
        System.out.println(closestElements);
    }
}
