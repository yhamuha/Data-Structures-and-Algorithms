package lc.graphs.m;

public class SurroundedRegions {
    /*public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0)
            return;
        int rows = board.length;
        int columns = board[0].length;
        for(int i=0; i<rows;i++) {                      // O(n)
            if(board[i][0] == 'O')
                boundaryDFS(board, i, 0);               // called in the worst case O(n*m)
            if(board[i][columns-1] == 'O')
                boundaryDFS(board, i, columns-1);       // called in the worst case O(n*m)
        }
        for(int j=0; j<columns; j++) {                  //O(m)
            if(board[0][j]=='O')
                boundaryDFS(board,0,j);                 // called in the worst case O(n*m)
            if (board[rows-1][j] =='O')
                boundaryDFS(board,rows-1,j);            // called in the worst case O(n*m)
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                else if (board[i][j] == '*')
                    board[i][j] = 'O';
            }
        }
    }
    public void boundaryDFS(char[][] board, int i, int j){
        if(i > board.length-1 || i<0 || j> board[0].length || j <0)
            return;
        if(board[i][j] == 'O')
            board[i][j] = '*';
        if(i>0 && board[i-1][j]=='O')
            boundaryDFS(board, i+1, j);
        if(i<board.length-1 && board[i+1][j] == 'O')
            boundaryDFS(board, i+1,j);
        if(j>0 && board[i][j-1] == 'O')
            boundaryDFS(board,i,j-1);
        if(j<board[0].length-1 && board[i][j+1] == 'O')
            boundaryDFS(board,i,j+1);
        return;
    }*/

    private int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    // O(m+n)
    public void solve(char[][] board) {
        // DFS
        int m = board.length, n = board[0].length;
        for(int i=0; i<m; i++){
            markBoard(board,m,n,i,0);   // left border
            markBoard(board,m,n,n-1,i);   // right border
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
