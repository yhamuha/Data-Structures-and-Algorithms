package lc.graphs.m;

public class NumberOfIslands {
    // O(m*n) O(m*n)
    public int numIslands(char[][] grid) {
        if (grid == null) return 0;
        int islandCount = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if (grid[i][j] == '1'){
                    ++islandCount;
                    markAsWater(grid, i, j);
                }
            }
        }
        return islandCount;
    }
    // dfs
    private void markAsWater(char[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length ||j>=grid[0].length || grid[i][j] == '0' )
            return;
        grid[i][j] = '0';
        markAsWater(grid, i-1,j);
        markAsWater(grid, i+1,j);
        markAsWater(grid, i,j-1);
        markAsWater(grid, i,j+1);
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
