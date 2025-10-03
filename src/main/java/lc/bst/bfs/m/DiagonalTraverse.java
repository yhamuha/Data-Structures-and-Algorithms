package lc.bst.bfs.m;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class DiagonalTraverse {
    // O(m * n) O(m * n) #walmart
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        int[] answer = new int[m * n];
        int index = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0});
        boolean odd = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> layer = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int[] coordinate = queue.poll();
                int first = coordinate[0];
                int second = coordinate[1];
                layer.add(matrix[first][second]);
                if (second == 0 && first + 1 < m)
                    queue.offer(new int[]{first + 1, second});
                if (second + 1 < n)
                    queue.offer(new int[]{first, second + 1});
            }
            if (odd) {
                for (int i = 0; i < layer.size(); i++)  // retrieve elements in natural order from the layer
                    answer[index++] = layer.get(i);
            } else {
                for (int i = layer.size() - 1; i >= 0; i--) // retrieve elements in reverse order from the layer
                    answer[index++] = layer.get(i);
            }
            odd = !odd;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        DiagonalTraverse solver = new DiagonalTraverse();
        int[] result = solver.findDiagonalOrder(matrix);
        for (int num : result)
            System.out.print(num + " ");
    }
}