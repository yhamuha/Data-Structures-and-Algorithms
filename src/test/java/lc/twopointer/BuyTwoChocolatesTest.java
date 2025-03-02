package lc.twopointer;

import lc.twopointer.e.BuyTwoChocolates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyTwoChocolatesTest {
    @Test
    public void testBuyChoco2() {
        BuyTwoChocolates buyTwoChocolates = new BuyTwoChocolates();
        int[] prices = {1, 2, 2};
        int money = 3;
        int expectedRemainingMoney = 0;
        assertEquals(expectedRemainingMoney, buyTwoChocolates.buyChoco(prices, money));
    }
}