package lc.adv_graph.m;

import java.util.Arrays;

public class MinCostToConnectAllPoints {
    // O(n^2) O(n)
    public int minCostConnectPoints(int[][] points) {
        int[] dist = new int[points.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        int ans = 0;

        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                dist[j] = Math.min(dist[j],
                        Math.abs(points[i][0] - points[j][0]) +
                                Math.abs(points[i][1] - points[j][1]));
                if (dist[j] < dist[i + 1]) {
                    int[] tempPoint = points[j];
                    points[j] = points[i + 1];
                    points[i + 1] = tempPoint;
                    int tempDist = dist[j];
                    dist[j] = dist[i + 1];
                    dist[i + 1] = tempDist;
                }
            }
            ans += dist[i + 1];
        }
        return ans;
    }

    public static void main(String[] args) {
        var mctcap = new MinCostToConnectAllPoints();
        int[][] points = {{3, 12}, {-2, 5}, {-4, 1}};
        System.out.println(mctcap.minCostConnectPoints(points));
    }
}
