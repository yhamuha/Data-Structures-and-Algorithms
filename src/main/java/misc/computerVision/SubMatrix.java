package misc.computerVision;
import misc.computerVision.MaxSum;

/**
 *
 */
public class SubMatrix {
    public int startRow;
    public int startCol;
    public int endRow;
    public int endCol;
    public int sum;

    public SubMatrix(int startRow, int endRow, int startCol, int endCol, int sum) {
        this.startRow = startRow;
        this.endRow = endRow;
        this.startCol = startCol;
        this.endCol = endCol;
        this.sum = sum;
    }

    SubMatrix getMaxSumMatrix (int[][] matrix) {
        int rowsCount = matrix.length;
        int rowLength = matrix[0].length;
        SubMatrix subMatrix = null;
        MaxSum maxSumRange = new MaxSum(0,0,0);

        for (int rowStart = 0; rowStart < rowsCount; rowStart++) {
            int[] colsSum = new int[rowLength];

            for (int currRow = rowStart; currRow < rowsCount; currRow++) {
                for (int i = 0; i < rowLength; i++)
                    colsSum[i] += matrix[currRow][i];
                maxSumRange = maxSumRange.getMaxSumRange(colsSum);
                if (subMatrix == null || maxSumRange.sum > subMatrix.sum)
                    subMatrix = new SubMatrix(rowStart, maxSumRange.start,
                            currRow, maxSumRange.end, maxSumRange.sum);
            }
        }
        return subMatrix;
    }

    @Override
    public String toString() {
        return "SubMatrix{" +
                "startRow=" + startRow +
                ", startCol=" + startCol +
                ", endRow=" + endRow +
                ", endCol=" + endCol +
                ", sum=" + sum +
                '}';
    }
}
