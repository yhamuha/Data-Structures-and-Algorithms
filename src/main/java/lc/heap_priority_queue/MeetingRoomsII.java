package lc.heap_priority_queue;

import java.util.Arrays;
import java.util.PriorityQueue;

class Interval{
    int start;
    int end;
    Interval() {start =0; end =0;}
    Interval(int s, int e) {start = s; end =e; }
}

public class MeetingRoomsII {
    // O(n log n)
    public int inMeetingRooms(Interval[] intervals) {
        if(intervals == null || intervals.length == 0)
            return 0;
        // O(n log n)
        Arrays.sort(intervals, (a,b) -> a.start - b.start);
        PriorityQueue<Interval> minHeap = new PriorityQueue<>((a,b)->(a.end - b.end));
        minHeap.add(intervals[0]);
        for(int i=1; i<intervals.length; i++) {
            Interval current = intervals[i];
            // O(log n)
            Interval earliest = minHeap.remove();
            if(current.start <= earliest.end)
                // O(1)
                earliest.end = current.end;
            else
                // O(log n)
                minHeap.add(current);
            // O(log  n)
            minHeap.add(earliest);
        }
        return minHeap.size();
    }

    public static void main(String[] args) {
        var mrII = new MeetingRoomsII();
        Interval int1 = new Interval(0,30);
        Interval int2 = new Interval(5,10);
        Interval int3 = new Interval(15,20);
        Interval[] intervals = {int1, int2, int3};
        System.out.println(mrII.inMeetingRooms(intervals));
    }
}
