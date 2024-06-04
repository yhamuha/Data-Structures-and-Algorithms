package lc.graphs.m;

public class MaxAreaOfIsland {
    // O(m*n) O(m*n)
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0, n=grid.length, m = grid[0].length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m;j++){
                if (grid[i][j] == 1){
                    int area = getArea(grid, i, j, n ,m);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }
    // dfs
    private int getArea(int[][] grid, int i, int j, int n, int m){
        if ( i<0 || j<0 || i>= n || j>= m || grid[i][j]==0)
            return 0;
        grid[i][j] = 0;
        int left = getArea(grid, i, j-1,n,m);
        int right = getArea(grid, i, j+1,n,m);
        int up = getArea(grid, i-1, j,n,m);
        int down = getArea(grid, i+1, j,n,m);
        return left + right + up + down + 1;
    }

    public static void main(String[] args) {
        var maoi = new MaxAreaOfIsland();
        int[][] grid = {
                        {0,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,1,1,0,1,0,0,0,0,0,0,0,0},
                        {0,1,0,0,1,1,0,0,1,0,1,0,0},
                        {0,1,0,0,1,1,0,0,1,1,1,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        System.out.println(maoi.maxAreaOfIsland(grid));
    }
}
