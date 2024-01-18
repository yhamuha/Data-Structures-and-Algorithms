package lc.graphs.m;

import java.util.*;

public class PacificAtlanticWaterFlow {
    int[][] heights;
    // O (log n * m)
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.heights = heights;
        List<List<Integer>> res = new LinkedList<>();
        Queue<int[]> queue = new LinkedList<>();
        int M = heights.length, N = heights[0].length;
        addRow(0, queue, N);
        addCol(0, queue, M);
        boolean[][] pacificTable = BFS(queue, M, N);
        addRow(M - 1, queue, N);
        addCol(N - 1, queue, M);
        boolean[][] atlanticTable = BFS(queue, M, N);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (atlanticTable[i][j] == true && pacificTable[i][j] == true) {
                    res.add(Arrays.asList(new Integer[] { i, j }));
                }
            }
        }
        return res;
    }

    private boolean[][] BFS(Queue<int[]> queue, int M, int N) {
        boolean[][] visited = new boolean[M][N];
        while (queue.isEmpty() == false) {
            int[] first = queue.poll();
            int row = first[0];
            int col = first[1];
            if (visited[row][col] == true)
                continue;
            visited[row][col] = true;
            int curCellVal = heights[row][col];
            if (0 <= row - 1 && heights[row - 1][col] >= curCellVal && visited[row - 1][col] == false) {
                queue.add(new int[] { row - 1, col }); // Top
            }
            if (0 <= col - 1 && heights[row][col - 1] >= curCellVal && visited[row][col - 1] == false) {
                queue.add(new int[] { row, col - 1 }); // Left
            }
            if (col + 1 < N && heights[row][col + 1] >= curCellVal && visited[row][col + 1] == false) {
                queue.add(new int[] { row, col + 1 }); // Right
            }
            if (row + 1 < M && heights[row + 1][col] >= curCellVal && visited[row + 1][col] == false) {
                queue.add(new int[] { row + 1, col }); // Down
            }
        }
        return visited;
    }

    private void addRow(int row, Queue<int[]> queue, int totalCols) {
        for (int i = 0; i < totalCols; i++) {
            int col = i;
            int[] coor = { row, col };
            queue.add(coor);
        }
    }

    private void addCol(int col, Queue<int[]> queue, int totalRows) {
        for (int i = 0; i < totalRows; i++) {
            int row = i;
            int[] coor = { row, col };
            queue.add(coor);
        }
    }

    public static void main(String[] args) {
        var pawf = new PacificAtlanticWaterFlow();
        int[][] heights = {
                {1,2,2,3,5},
                {3,2,3,4,4},
                {2,4,5,3,1},
                {6,7,1,4,5},
                {5,1,1,2,4}
        };
        System.out.println(pawf.pacificAtlantic(heights));
    }
}
