package lc.intervals.e;

import java.util.Arrays;

public class AttendMeetings {
    // O(n) O(1)
    public static boolean canAttendMeeting(int[][] intervals) {
        if (intervals.length == 0 || intervals.length == 1)
            return true;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] intervals = {{2, 4}, {9, 12}, {6, 9}, {13, 15}};
        System.out.println(canAttendMeeting(intervals));
    }
}
