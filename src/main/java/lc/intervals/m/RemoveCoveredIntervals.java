package lc.intervals.m;

import java.util.Arrays;

public class RemoveCoveredIntervals {
    // O(n log n) O(1)
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int prev = 0;
        int counter = 0;
        while (prev < intervals.length) {
            int min = intervals[prev][0];
            int max = intervals[prev][1];
            while (prev < intervals.length - 1 && min <= intervals[prev + 1][0] && max >= intervals[prev + 1][1]) {
                counter++;
                prev++;
            }
            prev++;
        }
        return intervals.length - counter;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,4},{3,6},{2,8}};
        var rci = new RemoveCoveredIntervals();
        System.out.println(rci.removeCoveredIntervals(intervals));
    }
}
