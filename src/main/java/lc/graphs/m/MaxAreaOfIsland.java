package lc.graphs.m;

public class MaxAreaOfIsland {

    /*boolean seen[][];
    // overall TC: (O n * m * n * m) <==> O(n^2 * m^2)
    public int maxAreaOfIsland(int[][] grid) {
        //O(n * m) iterates through n rows * m columns
        int maxArea = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        seen = new boolean[rows][columns];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                //O(n * m) recursion
                maxArea = Math.max(maxArea, area(i,j,grid));
            }
        }
        return maxArea;
    }

    private int area(int row, int column, int[][] grid) {
        if (    row<0 || row >= grid.length ||
                column<0 || column >= grid[row].length ||
                seen[row][column] ||
                grid[row][column]==0) {
            return 0;
        }
        seen[row][column] = true;
        return (1 +
                area(row+1,column, grid) +
                area(row-1,column, grid)) +
                area(row,column-1, grid) +
                area(row,column+1, grid);*/
    // O(n*m) O(n*m)
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
