package lc.graphs.m;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    int[][] directions = {  {-1,0}, // top
                            {0,-1}, // left
                            {1,0},  // bottom
                            {0,1}}; // right

    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;    // O(m * n)
        int freshOranges = 0;                       // count freshOranges
        for(int i=0; i< m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    ++freshOranges;
                }
            }
        }
        Queue<Integer> queue = new LinkedList<>();  // O(m * n)
        for(int i=0; i<m; i++){                     // determine "2" positions
            for(int j=0; j<n; j++){
                if (grid[i][j] == 2)
                    queue.add(i * n +j);            // converting 2d->1d coordinates
            }
        }
        int minutes = 0;
        // conditions for BFS
        while(!queue.isEmpty() && freshOranges > 0){    // O(m * n)
            int size = queue.size();
            for(int i=0; i< size; i++){
                int num = queue.poll(), row = num / n, col = num % n;
                for(int[] direction : directions) {
                    int x = direction[0] + row, y = direction[1] + col; // converting 1d->2d coordinates
                    if(x>-1 && y>-1 && x<m && y< n && grid[x][y] == 1){
                        queue.add(x*n + y);
                        --freshOranges;
                        grid[x][y] = 2;
                    }
                }
            }
            ++minutes;
        }
        return freshOranges == 0 ? minutes: -1;
    }

    public static void main(String[] args) {
        var ro = new RottingOranges();
        int[][] grid = {{2,1,1},
                        {1,1,0},
                        {0,1,1}};
        System.out.println(ro.orangesRotting(grid));
    }
}
