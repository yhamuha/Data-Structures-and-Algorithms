package lc.heap_priority_queue;

import java.util.PriorityQueue;
import java.util.Queue;

// in case of using sort: n^2 or n log n(merge);
// heap - log n;   <-

// TC: O(log n); SC: O(n)
public class FindMedianFromDataStream {
    Queue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
    Queue<Integer> minHeap = new PriorityQueue<>();
    int size = 0;
    public FindMedianFromDataStream(){}

    public void addNum (int num){
        size++;
        if(maxHeap.isEmpty() || num <= maxHeap.peek())
            maxHeap.add(num);
        else{
            minHeap.add(num);
        }
        if (minHeap.size() + 1 < maxHeap.size()){       // balancing
            Integer element = maxHeap.poll();
            minHeap.add(element);
        } else if (maxHeap.size() < minHeap.size()){
            Integer element = minHeap.poll();
            maxHeap.add(element);
        }
    }
    public double findMedian(){
            if(size%2 != 0)                             // odd
                return (double) maxHeap.peek();
        return (maxHeap.peek() + minHeap.peek()) / 2.0; // even
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
