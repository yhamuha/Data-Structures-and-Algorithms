package lc.monotonicstack;

import lc.stack.e.ImplementStackUsingQueues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStackUsingQueuesTest {
    @Test
    public void testStackOperations() {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();

        assertTrue(stack.empty());

        stack.push(1);
        assertFalse(stack.empty());
        assertEquals(1, stack.top());

        stack.push(2);
        assertFalse(stack.empty());
        assertEquals(2, stack.top());

        assertEquals(2, stack.pop());
        assertFalse(stack.empty());
        assertEquals(1, stack.top());

        assertEquals(1, stack.pop());
        assertTrue(stack.empty());
    }
}