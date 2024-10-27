package lc.arraysandhashing.e;

public class MatrixDiagonalSum {
    // O(n) O(1)
    public int diagonalSum(int[][] mat) {
        int j =mat.length-1;
        int sum =0;
        for(int i =0 ;i<mat.length;i++){
            sum+= mat[i][i];
            if(!(i==j-i))
                sum+= mat[i][j-i];
        }
        return sum;
    }

    public static void main(String[] args) {
        MatrixDiagonalSum solution = new MatrixDiagonalSum();
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(solution.diagonalSum(mat));
    }
}
