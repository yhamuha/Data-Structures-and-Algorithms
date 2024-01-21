package lc.graphs.m;

import java.util.*;

public class PacificAtlanticWaterFlow {
    int[][] heights;
    // O (log n * m)
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.heights = heights;
        List<List<Integer>> res = new LinkedList<>();
        Queue<int[]> queue = new LinkedList<>();
        int m = heights.length, n = heights[0].length;
        // add row to Pacific
        addRow(0, queue, n);
        addCol(0, queue, m);
        boolean[][] pacificTable = BFS(queue, m, n);
        // add row to Atlantic
        addRow(m - 1, queue, n);
        addCol(n - 1, queue, m);
        boolean[][] atlanticTable = BFS(queue, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (atlanticTable[i][j] == true && pacificTable[i][j] == true) {
                    res.add(Arrays.asList(new Integer[] { i, j }));
                }
            }
        }
        return res;
    }
    // O (m * n); where m, n - dimension of input grid
    private boolean[][] BFS(Queue<int[]> queue, int m, int n) {
        boolean[][] visited = new boolean[m][n];
        while (!queue.isEmpty()) {
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
            if (col + 1 < n && heights[row][col + 1] >= curCellVal && visited[row][col + 1] == false) {
                queue.add(new int[] { row, col + 1 }); // Right
            }
            if (row + 1 < m && heights[row + 1][col] >= curCellVal && visited[row + 1][col] == false) {
                queue.add(new int[] { row + 1, col }); // Down
            }
        }
        return visited;
    }

    private void addRow(int row, Queue<int[]> queue, int totalCols) {
        for (int i = 0; i < totalCols; i++) {
            int[] coordinate = { row, i };
            queue.add(coordinate);
        }
    }

    private void addCol(int col, Queue<int[]> queue, int totalRows) {
        for (int i = 0; i < totalRows; i++) {
            int[] coordinate = { i, col };
            queue.add(coordinate);
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
