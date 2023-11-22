package misc.problem_solving;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
class TicTacToeTest {

    TicTacToe ttt = new TicTacToe(3);

    @Test
    public void testWinFirstPlayer() {
        int result1 = ttt.move(0,0,1);
        int result2 = ttt.move(0,1,1);
        int result3 = ttt.move(0,2,1);
        assertEquals(1, result3);
    }

    @Test
    public void testWinSecondPlayer() {
        int result1 = ttt.move(0,0,2);
        int result2 = ttt.move(0,1,2);
        int result3 = ttt.move(0,2,2);
        assertEquals(2, result3);
    }
}