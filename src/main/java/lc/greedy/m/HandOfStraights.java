package lc.greedy.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class HandOfStraights {
    // TC: O(n log n) <- TreeMap for n's numbers
    // SC: O(n)
    public boolean isNStraightHand(int[] hand, int W) {
        TreeMap<Integer, Integer> card_counts = new TreeMap<>(); // sorted
        for (int card : hand) {
            if (!card_counts.containsKey(card)) {
                card_counts.put(card, 1);
            } else {
                card_counts.replace(card, card_counts.get(card) + 1);
            }
        }
        while (card_counts.size() > 0) {
            int first_card = card_counts.firstKey();
            for (int i=first_card; i< first_card + W; i++) {
                if (!card_counts.containsKey(i))
                    return false;
                int count = card_counts.get(i);
                if (count == 1) {
                    card_counts.remove(i);
                } else {
                    card_counts.replace(i, card_counts.get(i) - 1);
                }
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
