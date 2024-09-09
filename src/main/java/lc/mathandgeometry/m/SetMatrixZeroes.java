package lc.mathandgeometry.m;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes {
    // O(n^2) O(n)
    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    arr.add(i);
                    arr.add(j);
                }
            }
        }
        for (int i = 0; i < arr.size(); i += 2) {
            for (int j = 0; j < matrix.length; j++)
                matrix[j][arr.get(i + 1)] = 0;
            for (int j = 0; j < matrix[0].length; j++)
                matrix[arr.get(i)][j] = 0;
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        printMatrix(matrix);
        setZeroes(matrix);
        System.out.println();
        printMatrix(matrix);
    }
}
