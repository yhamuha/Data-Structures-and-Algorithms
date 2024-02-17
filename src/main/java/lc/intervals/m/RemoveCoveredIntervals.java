package lc.intervals.m;

import java.util.Arrays;

public class RemoveCoveredIntervals {
    // O(n log n) O(1)
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, this::compare);
        int i = 0;
        int c = 0;
        while (i < intervals.length) {
            int min = intervals[i][0];
            int max = intervals[i][1];
            while (i < intervals.length - 1 && min <= intervals[i + 1][0] && max >= intervals[i + 1][1]) {
                c++;
                i++;
            }
            i++;
        }
        return intervals.length - c;
    }

    private int compare(int[] a, int[] b) {
        if (a[0] == b[0]) {
            return b[1] - a[1];
        }
        return a[0] - b[0];
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,4},{3,6}, {2,8}};
        var rci = new RemoveCoveredIntervals();
        System.out.println(rci.removeCoveredIntervals(intervals));
    }
}
