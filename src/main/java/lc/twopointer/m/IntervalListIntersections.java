package lc.twopointer.m;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
    // O(n) O(n)
    static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if(firstList.length == 0 || secondList.length == 0) return new int[0][0];
        int i = 0;
        int j = 0;
        int startMax = 0, endMin = 0;
        List<int[]> ans = new ArrayList<>();
        while(i < firstList.length && j < secondList.length) {
            startMax = Math.max(firstList[i][0], secondList[j][0]);
            endMin = Math.min(firstList[i][1], secondList[j][1]);
            if(endMin >= startMax)
                ans.add(new int[]{startMax, endMin});
            if(endMin == firstList[i][1]) i++;
            if(endMin == secondList[j][1]) j++;
        }
        return ans.toArray(new int[ans.size()][2]);
    }

    public static void main(String[] args) {
        int[][] firstList = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] secondList = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] result = intervalIntersection(firstList, secondList);
        for (int[] interval : result)
            System.out.print("[" + interval[0] + "," + interval[1] + "]" + " ");
    }
}
