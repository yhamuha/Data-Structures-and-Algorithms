package onemoretime.parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Wh_ParenthesesCheckerTest {

    @Test
    void testIsBalanced() {
        String parentheses = "{}";
        assertTrue(Wh_ParenthesesChecker.isBalanced(parentheses), " is balanced.");
    }
    @Test
    void testIsUnBalanced() {
        String parentheses = "{(}";
        assertFalse(Wh_ParenthesesChecker.isBalanced(parentheses), " is un-balanced.");
    }
}