package lc.greedy.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class HandOfStraights {
    /*public boolean isNStraightHand(int[] hand, int groupSize) {
        Arrays.sort(hand);
        ArrayList<Integer> list = new ArrayList<>();
        for(int x:hand)
            list.add(x);
        while(true){
            if(list.size()==0)
                return true;
            int temp = list.get(0), count1 = 0;
            for(int i =1;i<groupSize;i++)
                if(list.contains(temp+i))
                    count1++;
            if(count1!=groupSize-1)
                return false;
            for(int i =0;i<groupSize;i++)
                list.remove(Integer.valueOf(temp+i));
        }
    }*/

    // overall O(M * log n + n * W)
    // m - number of cards in hand
    // n - number of unique cards in TreeMap
    public boolean isNStraightHand(int[] hand, int W) {
        // TreeMap insertion O(log n)
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
