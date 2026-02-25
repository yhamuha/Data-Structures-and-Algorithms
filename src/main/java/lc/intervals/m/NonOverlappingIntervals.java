package lc.intervals.m;

import java.util.Arrays;

public class NonOverlappingIntervals {
    // O(n log n) O(1)
    /*static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int prev = 0, count = 1;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] >= intervals[prev][1]) {
                prev = i;
                count++;
            }
        }
        return intervals.length - count;
    }*/
    // O(n log n) O(1)
    public static int nonOverlappingIntervals(int[][] intervals) {
        if (intervals == null || intervals.length <= 1)
            return 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int end = intervals[0][1];
        int count = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                end = intervals[i][1];
                count++;
            }
        }
        return intervals.length - count;
    }

    public static void main(String[] args) {
        int[][] intervals = {{4, 6}, {11, 17}, {2, 18}, {7, 10}};
        System.out.println(nonOverlappingIntervals(intervals));
    }
}
