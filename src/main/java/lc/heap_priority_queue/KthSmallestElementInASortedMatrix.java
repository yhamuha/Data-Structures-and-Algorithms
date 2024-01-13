package lc.heap_priority_queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        // overall: O(k * log(min(N, k)))

        // O(min(N,k) * O(log min(N,k)))
        // N - number of rows in the input matrix; O(log min(N,k)) - each addition to heap
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> matrix[a[0]][a[1]] - matrix[b[0]][b[1]]);
        int N = matrix.length;
        for(int i = 0; i < Math.min(N, k); i++){
            pq.add(new int[]{i, 0});
        }
        // O(k * log(min (N,k)))
        while(k > 0){
            int[] element = pq.poll();
            k--;
            if(k == 0) return matrix[element[0]][element[1]];
            if(element[1] + 1 < matrix[0].length) pq.add(new int[]{element[0], element[1] + 1});
        }
        return -1;
    }

    public static void main(String[] args) {
        var kseiasm = new KthSmallestElementInASortedMatrix();
        int[][] matrix = {{1,5,9}, {10,11,13},{12,13,15}};
        int k = 8;
        System.out.println(kseiasm.kthSmallest(matrix, k));
    }
}
