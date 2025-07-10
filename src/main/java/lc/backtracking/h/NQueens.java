package lc.backtracking.h;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NQueens {
    // O(n!) O(n^2)
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<List<String>>();

        char[][] board = new char[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                board[row][col] = '.';
            }
        }
        solveNQueens(board, 0, result, new HashSet<>(), new HashSet<>(), new HashSet<>());
        return result;
    }

    private void solveNQueens(char[][] board, int row, List<List<String>> result, Set<Integer> columns, Set<Integer> diagonals, Set<Integer> antiDiagonals) {
        if (row == board.length) {
            result.add(toResult(board));
            return;
        }

        for (int col = 0; col < board[0].length; col++) {
            int diag = row - col;
            int antiDiag = row + col;

            if (columns.contains(col) || diagonals.contains(diag) || antiDiagonals.contains(antiDiag)) continue;

            board[row][col] = 'Q';
            columns.add(col);
            diagonals.add(diag);
            antiDiagonals.add(antiDiag);

            solveNQueens(board, row + 1, result, columns, diagonals, antiDiagonals);

            board[row][col] = '.';
            columns.remove(col);
            diagonals.remove(diag);
            antiDiagonals.remove(antiDiag);
        }
    }

    private List<String> toResult(char[][] board) {
        List<String> result = new ArrayList<String>(board.length);
        for (int i = 0; i < board.length; i++) {
            result.add(new String(board[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        var nq = new NQueens();
        int n = 4;
        System.out.println(nq.solveNQueens(n));
    }
}
