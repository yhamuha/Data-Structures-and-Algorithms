package lc.graphs.m;

public class MaxAreaOfIsland {
    // O(m*n) O(m*n)
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0; int m = grid.length; int n = grid[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int area = getArea(grid,i,j,m,n);
                max = Math.max(max,area);
            }
        }
        return max;
    }
    // dfs
    private int getArea(int[][] grid, int i, int j, int m, int n){
        if (i<0 || j<0 || i>=m || j>=n || grid[i][j]==0)
            return 0;
        grid[i][j]=0;
        int left = getArea(grid,i,j-1,m,n);
        int right = getArea(grid,i,j+1,m,n);
        int up = getArea(grid,i-1,j,m,n);
        int down = getArea(grid,i+1,j,m,n);
        return left+right+up+down+1;
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
