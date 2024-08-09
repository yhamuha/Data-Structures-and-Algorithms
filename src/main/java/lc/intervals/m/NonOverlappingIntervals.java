package lc.intervals.m;

import java.util.Arrays;

public class NonOverlappingIntervals {
    // O(n log n) O(1)
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1], b[1]));
        int prev=0, count=1;
        for(int i=0; i<intervals.length; i++){
            if(intervals[i][0] >= intervals[prev][1]){
                prev=i;
                count++;
            }
        }
        return intervals.length - count;
    }

    public static void main(String[] args) {
        var noi = new NonOverlappingIntervals();
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(noi.eraseOverlapIntervals(intervals));
    }
}
