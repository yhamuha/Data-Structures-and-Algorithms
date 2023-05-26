package onemoretime.island;

/**
 * finding islands using depth-first search approach
 */
public class IslandFinder {
    public int findIslands(int[][] grid) {
        int row = grid.length;
        if (row == 0) return 0;

        int col = grid[0].length;
        int count = 0;

        // Iterate through each cell in the grid
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    // Found a new island, perform DFS to explore it
                    exploreIsland(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    private void exploreIsland(int[][] grid, int i, int j) {
        int row = grid.length;
        int col = grid[0].length;

        // Check if the current cell is within the grid and is part of an island
        if (i < 0 || i >= row || j < 0 || j >= col || grid[i][j] != 1) {
            return;
        }

        // Mark the current cell as visited by changing its value
        grid[i][j] = -1;

        // Explore the neighboring cells in a recursive manner
        exploreIsland(grid, i + 1, j); // Explore cell below
        exploreIsland(grid, i - 1, j); // Explore cell above
        exploreIsland(grid, i, j + 1); // Explore cell to the right
        exploreIsland(grid, i, j - 1); // Explore cell to the left
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 0, 1, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 0, 1, 1}
        };

        IslandFinder islandFinder = new IslandFinder();
        int islandCount = islandFinder.findIslands(grid);
        System.out.println("Number of islands: " + islandCount);
    }
}
