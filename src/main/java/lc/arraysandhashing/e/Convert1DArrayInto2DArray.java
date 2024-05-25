package lc.arraysandhashing.e;

import java.util.Arrays;

public class Convert1DArrayInto2DArray {
    // O(m*n) O(m*n)
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr = new int[m][n];
        if(original.length != m*n){
            return new int[0][0];
        }
        for(int i = 0; i < original.length; i++) {
            int row = i/n; // 0/2=0 1/2=0 2/2=1 3/2=1
            int col = i%n; // 0%2=0 1%2=1 2%2=0 3%2=1
            arr[row][col] = original[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Convert1DArrayInto2DArray converter = new Convert1DArrayInto2DArray();
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int[][] result = converter.construct2DArray(original, m, n);
        System.out.println("Given array: \n" + Arrays.toString(original));
        System.out.println("Converted 2D Array:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
