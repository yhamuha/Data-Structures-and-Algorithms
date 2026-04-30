package lc.arraysandhashing.m;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    // O(n^2) O(n)
        static boolean isValidSudoku(char[][] board) {
            Set<String> set = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                for (int column = 0; column < 9; column++) {
                    char number = board[row][column];
                    if (number != '.') {
                        boolean rowCheck = set.add(number + " in row " + row);
                        boolean colCheck = set.add(number + " in column " + column);
                        boolean blockCheck = set.add(number + " in block " + (row / 3) + "," + (column / 3));
                        if (!rowCheck || !colCheck || !blockCheck) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        public static void main(String[] args) {
            char[][] board = {
                    {'5', '3', '.', '.', '5', '.', '.', '.', '.'},
                    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
            };
            System.out.println(isValidSudoku(board));
        }
    }
