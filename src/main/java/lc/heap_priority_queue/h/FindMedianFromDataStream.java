package lc.heap_priority_queue.h;

import java.util.PriorityQueue;
import java.util.Queue;

public class FindMedianFromDataStream {
    // O(n log n) O(n)
    Queue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
    Queue<Integer> minHeap = new PriorityQueue<>();
    int size = 0;
    public FindMedianFromDataStream(){}
    public void addNum (int num) {
        size++;
        if(maxHeap.isEmpty() || num <= maxHeap.peek())
            maxHeap.add(num);
        else
            minHeap.add(num);
        if (minHeap.size() + 1 < maxHeap.size()) {
            Integer element = maxHeap.poll();
            minHeap.add(element);
        } else if (maxHeap.size() < minHeap.size()) {
            Integer element = minHeap.poll();
            maxHeap.add(element);
        }
    }
    public double findMedian() {
            if(size % 2 != 0)
                return (double) maxHeap.peek();
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }

    public static void main(String[] args) {
        var fmfds = new FindMedianFromDataStream();
        fmfds.addNum(1);
        fmfds.addNum(2);
        System.out.println(fmfds.findMedian());
        fmfds.addNum(3);
        System.out.println(fmfds.findMedian());
    }
}
