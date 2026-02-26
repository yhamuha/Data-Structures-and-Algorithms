package lc.intervals.h;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeFreeTime {
    // O(n log n) time | O(n) space
    public static  int[][] employeeFreeTime(int[][][] schedule) {
        List<int[]> flattened = new ArrayList<>();
        for (int[][] employee : schedule) {
            for (int[] interval : employee) {
                flattened.add(interval);
            }
        }
        Collections.sort(flattened, (a, b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : flattened) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(new int[]{interval[0], interval[1]});
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        List<int[]> free_times = new ArrayList<>();
        for (int i = 1; i < merged.size(); i++) {
            int start = merged.get(i - 1)[1];
            int end = merged.get(i)[0];
            if (start < end) {
                free_times.add(new int[]{start, end});
            }
        }
        return free_times.toArray(new int[free_times.size()][]);
    }

    public static void main(String[] args) {
        int[][][] schedule = {
                {{2, 4}, {7, 10}},
                {{1, 5}},
                {{6, 9}}
        };
        int[][] result = employeeFreeTime(schedule);
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }

    }
}
