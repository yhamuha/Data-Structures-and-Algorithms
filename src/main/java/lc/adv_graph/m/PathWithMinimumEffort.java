package lc.adv_graph.m;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PathWithMinimumEffort {
    // Dijikstra's
    // O (log m * n)
    // O(m * n)
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int[][] dist = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        dist[0][0] = 0;
        minHeap.add(new int[]{0, 0, 0});
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!minHeap.isEmpty()) {
            int[] temp = minHeap.poll();

            int tempDist = temp[0];
            int x = temp[1];
            int y = temp[2];

            if (x == m - 1 && y == n - 1) {
                return tempDist;
            }

            for (int[] dir : dirs) {
                int dx = x + dir[0];
                int dy = y + dir[1];

                if (dx >= 0 && dx < heights.length && dy >= 0 && dy < heights[0].length) {
                    int newDiff = Math.max(Math.abs(heights[x][y] - heights[dx][dy]), tempDist);
                    if (newDiff < dist[dx][dy]) {
                        dist[dx][dy] = newDiff;
                        minHeap.add(new int[]{newDiff, dx, dy});
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        var pwme = new PathWithMinimumEffort();
        int[][] heights = {{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        System.out.println(pwme.minimumEffortPath(heights));
    }
}
