package lc.arraysandhashing.m;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes {
    // O(m * n) O(m + n) #walmart
    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> zeroesList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroesList.add(i);
                    zeroesList.add(j);
                }
            }
        }
        for (int i = 0; i < zeroesList.size(); i += 2) {
            for (int j = 0; j < matrix.length; j++)
                matrix[j][zeroesList.get(i + 1)] = 0;
            for (int j = 0; j < matrix[0].length; j++)
                matrix[zeroesList.get(i)][j] = 0;
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix);
        printMatrix(matrix);
    }
}
