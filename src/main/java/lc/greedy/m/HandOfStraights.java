package lc.greedy.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class HandOfStraights {
    // TC: O(n log n) <- TreeMap for n's numbers
    // SC: O(n)
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer, Integer> cardCount = new TreeMap<>();
        for (int card : hand) {
            if (!cardCount.containsKey(card))
                cardCount.put(card,1);
            else
                cardCount.replace(card, cardCount.get(card)+1);
        }

        while (cardCount.size() > 0) {
            int firstCard = cardCount.firstKey();
            for(int i=firstCard; i<firstCard + groupSize; i++){
                if (!cardCount.containsKey(i))
                    return false;
                int count = cardCount.get(i);
                if (count == 1)
                    cardCount.remove(i);
                else
                    cardCount.replace(i, cardCount.get(i)-1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        var hos = new HandOfStraights();
        int[] hand = {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;
        System.out.println(hos.isNStraightHand(hand, groupSize));
    }
}
