package misc.computerVision;

/**
 *
 */
public class SubMatrix {
    public int startRow;
    public int endRow;
    public int startCol;
    public int endCol;
    public int sum;

    public SubMatrix(int startRow, int endRow, int startCol, int endCol, int sum) {
        this.startRow = startRow;
        this.endRow = endRow;
        this.startCol = startCol;
        this.endCol = endCol;
        this.sum = sum;
    }
}

