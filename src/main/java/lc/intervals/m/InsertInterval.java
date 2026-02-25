package lc.intervals.m;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    // O(n) O(n)
    /*static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> insertedIntervals = new ArrayList<>();
        boolean inserted = false;
        for (int[] interval : intervals) {
            if (interval[1] < newInterval[0])
                insertedIntervals.add(interval);
            else if (interval[0] > newInterval[1]) {
                if (!inserted) {
                    insertedIntervals.add(newInterval);
                    inserted = true;
                }
                insertedIntervals.add(interval);
            } else {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
        if (!inserted)
            insertedIntervals.add(newInterval);
        return insertedIntervals.toArray(new int[insertedIntervals.size()][2]);
    }*/

    // O(n) O(n)
    public static int[][] insertIntervals(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>();
        int i = 0;
        int n = intervals.length;
        while (i < n && intervals[i][1] < newInterval[0]) {
            merged.add(intervals[i]);
            i++;
        }
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        merged.add(newInterval);
        for (int j = i; j < n; j++)
            merged.add(intervals[j]);
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{4,6},{6,7},{8,10},{11,15}};
        int[] newInterval = {5,8};
        int[][] result = insertIntervals(intervals, newInterval);
        for (int i = 0; i < result.length; i++) {
            System.out.print("[");
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
                if (j < result[i].length - 1)
                    System.out.print(",");
            }
            System.out.print("]");
        }
    }
}
