package lc.arraysandhashing.e;

import java.util.Arrays;

public class RowWithMaximumOnes {
    //O(n*m) O(1)
    public int[] rowAndMaximumOnes(int[][] mat) {
    int max = 0;
    int[] result = new int[2];
    for (int i = 0; i < mat.length; i++) {
        int count = 0;
        for (int j = 0; j < mat[i].length; j++) {
            if (mat[i][j] == 1) {
                count++;
            }
        }
        if (count > max) {
            max = count;
            result[0] = i;
            result[1] = count;
        }
    }
    return result;
    }

    public static void main(String[] args) {
    int[][] mat = {
            {0, 1},
            {1, 0}
    };
    System.out.println(Arrays.toString(new RowWithMaximumOnes().rowAndMaximumOnes(mat)));
    }
}
