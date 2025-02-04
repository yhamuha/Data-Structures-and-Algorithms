package lc.heap_priority_queue.m;

import java.util.PriorityQueue;

public class KthSmallestElementInASortedMatrix {
    // O(k log (min(n,k))) O(min(n,k))
    static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> matrix[a[0]][a[1]] - matrix[b[0]][b[1]]);
        int n = matrix.length;
        for(int i=0; i<Math.min(n,k); i++)
            minHeap.offer(new int[] {i,0});
        while(k>0){
            int[] element = minHeap.poll();
            k--;
            if (k == 0)
                return matrix[element[0]][element[1]];
            if (element[1]+1 < matrix[0].length)
                minHeap.offer(new int[] {element[0],element[1]+1});
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = {  {1,5,9},
                            {10,11,13},
                            {12,13,15}};
        int k = 8;
        System.out.println(kthSmallest(matrix, k));
    }
}
