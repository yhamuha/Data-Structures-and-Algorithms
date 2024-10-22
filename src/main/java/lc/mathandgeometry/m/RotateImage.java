package lc.mathandgeometry.m;

public class RotateImage {
    // O(n^2) O(1)
    public void rotate(int[][] matrix) {
        int m = matrix.length / 2, n = matrix.length-1;
        for (int i = 0; i < m; i++, n--)
            for (int j = i; j < n; j++) {
                int xJ = matrix.length - j - 1;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[xJ][i];
                matrix[xJ][i] = matrix[n][xJ];
                matrix[n][xJ] = matrix[j][n];
                matrix[j][n] = temp;
            }
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        RotateImage rotateImage = new RotateImage();
        rotateImage.rotate(matrix);
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
