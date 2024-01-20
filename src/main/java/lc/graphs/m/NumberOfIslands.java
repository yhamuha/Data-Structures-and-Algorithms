package lc.graphs.m;

public class NumberOfIslands {
    /*public int numIslands(char[][] grid) {
        int count = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count += 1;
                    callBFS(grid, i, j);
                }
            }
        } return count;
    }

    private void callBFS(char[][] grid, int i, int j) {
        if (i<0 || i>=grid.length || j<0 || j>= grid[i].length || grid[i][j] == '0')
            return;
        grid[i][j] ='0';
        callBFS(grid, i+1, j);
        callBFS(grid, i-1, j);
        callBFS(grid, i, j-1);
        callBFS(grid, i, j+1);
    }*/
    public int numIslands(char[][] grid) {
        if (grid == null) return 0;
        int islandCount = 0;
        for(int i=0; i< grid.length; i++){
            for(int j=0; j<grid[0].length;j++){
                if(grid[i][j] == '1') {
                    ++islandCount;
                    changeLandToWater(grid, i, j);
                }
            }
        }
        return islandCount;
    }
    // DFS
    private void changeLandToWater(char[][] grid, int i, int j){
        // base case
        if (i<0 || i>= grid.length || j<0 || j>=grid[0].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        changeLandToWater(grid,i-1,j);  // up
        changeLandToWater(grid,i+1,j);  // down
        changeLandToWater(grid,i,j-1);  // left
        changeLandToWater(grid,i,j+1);  // right
    }

    public static void main(String[] args) {
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        System.out.println(numberOfIslands.numIslands(grid));
    }
}
