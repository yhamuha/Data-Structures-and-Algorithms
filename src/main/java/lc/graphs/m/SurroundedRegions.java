package lc.graphs.m;

public class SurroundedRegions {

    private int[][] directions = {  {1,0}, {-1,0}, {0,1}, {0,-1}};
    // O(m*n) O(m*n)
    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        for(int i=0; i<m; i++){
            markBoard(board,m,n,i,0);   // going through border cells
            markBoard(board,m,n,i,n-1);
        }
        for(int i=0; i<n; i++){         // going through border cells
            markBoard(board,m,n,0,i);
            markBoard(board,m,n,m-1,i);
        }
        flipBoard(board, m, n);
    }
    private void markBoard(char[][] board, int m, int n, int i, int j){ // mark in "M" border closed
        if(i<0 || j<0 || i>=m || j>= n || board[i][j] != 'O') return;
        board[i][j] = 'M';
        for (int[] direction : directions){
            int x = direction[0]+i, y = direction[1]+j;
            markBoard(board,m,n,x,y);
        }
    }
    private void flipBoard(char[][] board, int m, int n){   // flip all "M"'s and "O"'s to "O" and "X" respectively
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
