package lc.adv_graph.h;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class SwimInRisingWater {
    // O(n log n) O(n)
    public int swimInWater(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        Set<String> visited = new HashSet<>();
        int maxTime = grid[0][0];
        minHeap.offer(new int[]{0, 0, 0});
        visited.add("0,0");
        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int w = current[0];
            int r = current[1];
            int c = current[2];
            maxTime = Math.max(maxTime, w);
            if (r == ROWS - 1 && c == COLS - 1) {
                return maxTime;
            }
            int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            for (int[] dir : directions) {
                int newR = r + dir[0];
                int newC = c + dir[1];
                if (newR >= 0 && newR < ROWS && newC >= 0 && newC < COLS && !visited.contains(newR + "," + newC)) {
                    minHeap.offer(new int[]{grid[newR][newC], newR, newC});
                    visited.add(r + "," + c);
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        SwimInRisingWater sirw = new SwimInRisingWater();
        int[][] grid1 = {
                {0, 1, 2, 3, 4},
                {24, 23, 22, 21, 5},
                {12, 13, 14, 15, 16},
                {11, 17, 18, 19, 20},
                {10, 9, 8, 7, 6}
        };
        System.out.println(sirw.swimInWater(grid1));
    }
}
