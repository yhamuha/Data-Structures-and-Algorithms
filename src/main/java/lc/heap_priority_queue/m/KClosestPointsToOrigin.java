package lc.heap_priority_queue.m;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    // O(n log n) O(n)
    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b)->a[1]-b[1]);
        for(int i=0;i<points.length;i++){
            int coordinate[] = new int[2];
            coordinate[0] = i;
            coordinate[1] = (int)Math.pow(points[i][0],2)+(int)Math.pow(points[i][1],2);
            heap.add(coordinate);
        }
        for(int i=0;i<k;i++){
            int temp[] = heap.poll();
            result[i] = points[temp[0]];
        }
        return result;
    }

    public static void main(String[] args) {
        var kkpto = new KClosestPointsToOrigin();
        int[][] points = {{1,3}, {-2,2}, {0,1}};
        int k = 2;
        int[][] closestPoints = kkpto.kClosest(points, k);
        for (int[] point : closestPoints) {
            System.out.println(Arrays.toString(point));
        }
    }
}
