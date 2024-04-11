package lc.greedy.m;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoCitySchedulingTest {
    @Test
    public void testTwoCitySchedCost() {
        TwoCityScheduling scheduler = new TwoCityScheduling();
        int[][] costs = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        assertEquals(110, scheduler.twoCitySchedCost(costs));
    }
    @Test
    public void testTwoCitySchedCost2() {
        TwoCityScheduling scheduler = new TwoCityScheduling();
        int[][] costs = {{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}};
        assertEquals(1859, scheduler.twoCitySchedCost(costs));
    }
}