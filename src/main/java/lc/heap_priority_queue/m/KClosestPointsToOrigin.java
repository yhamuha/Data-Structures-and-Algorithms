package lc.heap_priority_queue.m;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    // O(n log n) O(n)
    static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> (a[1] - b[1]));
        int[][] result = new int[k][2];
        for(int i=0; i<points.length; i++){
            int[] coordinate = new int[2];
            coordinate[0] = i;
            coordinate[1] = (int)Math.pow(points[i][0],2) + (int)Math.pow(points[i][1],2);
            minHeap.add(coordinate);
        }
        for(int i=0; i<k; i++){
            int[] temp = minHeap.poll();
            result[i] = points[temp[0]];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] points = {{1,3}, {-2,2}, {0,1}};
        int k = 2;
        int[][] closestPoints = kClosest(points, k);
        for (int[] point : closestPoints) {
            System.out.println(Arrays.toString(point));
        }
    }
}
