package misc.problem_solving;

/**
 * 348. Design TicTacToe
 */
public class TicTacToe {

    int [] rowCounter;
    int [] colCounter;
    int diagLeft;
    int diagRight;
    int n;

    public TicTacToe(int n) {
        rowCounter = new int[n];
        colCounter = new int [n];
        diagLeft = 0;
        diagRight = 0;
        this.n = n;
    }

    public int move(int row, int col, int player) {
        int move = player == 1 ? 1 : -1;
        rowCounter[row] += move;
        colCounter[col] += move;
        if (row == col) diagLeft += move;
        if (row == n - col - 1) diagRight += move;
        if (rowCounter[row] == n || colCounter[col] == n || diagLeft == n || diagRight == n)
            return 1;
        else if (rowCounter[row] == -n || colCounter[col] == -n || diagLeft == -n || diagRight == -n)
            return 2;
        else
            return 0;
    }

    public static void main(String[] args) {
        TicTacToe ttt = new TicTacToe(3);
        int result = ttt.move(0,0,1);
        int result2 = ttt.move(0,1,1);
        int result3 = ttt.move(0,2,1);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
