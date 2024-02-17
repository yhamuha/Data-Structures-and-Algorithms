package lc.intervals.m;

import java.util.Arrays;

public class RemoveCoveredIntervals {
    // O(n log n) O(1)
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int index = 0;
        int overlapCounter = 0;
        while (index < intervals.length) {
            int min = intervals[index][0];
            int max = intervals[index][1];
            while (index < intervals.length - 1 && min <= intervals[index + 1][0] && max >= intervals[index + 1][1]) {
                overlapCounter++;
                index++;
            }
            index++;
        }
        return intervals.length - overlapCounter;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,4},{3,6}, {2,8}};
        var rci = new RemoveCoveredIntervals();
        System.out.println(rci.removeCoveredIntervals(intervals));
    }
}
