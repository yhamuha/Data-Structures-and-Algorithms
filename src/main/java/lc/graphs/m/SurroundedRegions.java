package lc.graphs.m;

public class SurroundedRegions {

    private int[][] directions = {  {1,0},  // down
                                    {-1,0}, // up
                                    {0,1},  // right
                                    {0,-1}} // left
            ;
    // O(m+n)
    public void solve(char[][] board) {
        // DFS
        int m = board.length, n = board[0].length;
        for(int i=0; i<m; i++){
            markBoard(board,m,n,i,0);   // left border
            markBoard(board,m,n,i,n-1);   // right border
        }
        for(int i=0; i<n; i++){
            markBoard(board,m,n,0,i); // top border
            markBoard(board,m,n,m-1,i); // bottom border
        }
        flipBoard(board, m, n);
    }
    // O(m*n)
    private void markBoard(char[][] board, int m, int n, int i, int j){
        if(i<0 || j<0 || i>=m || j>= n || board[i][j] != 'O') return;
        board[i][j] = 'M';
        for (int[] direction : directions){
            int x = direction[0]+i, y = direction[1]+j;
            markBoard(board,m,n,x,y);
        }
    }
    // O(m*n)
    private void flipBoard(char[][] board, int m, int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == 'M')
                    board[i][j] = 'O';
                else if (board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
    }

    public static void main(String[] args) {
        var sr = new SurroundedRegions();
        char[][] board = {  {'X','X','X','X'},
                            {'X','O','O','X'},
                            {'X','X','O','X'},
                            {'X','O','X','X'}};
        sr.solve(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
