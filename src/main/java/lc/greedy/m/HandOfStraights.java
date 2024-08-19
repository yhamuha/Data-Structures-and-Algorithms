package lc.greedy.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class HandOfStraights {
    // O(n log n) O(n)
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int card : hand){
            if(!map.containsKey(card))
                map.put(card, 1);
            else
                map.replace(card, map.get(card)+1);
        }
        while (map.size() > 0){
            int firstCard = map.firstKey();
            for(int i=firstCard; i<firstCard+groupSize; i++){
                if (!map.containsKey(i))
                    return false;
                int count = map.get(i);
                if (count == 1)
                    map.remove(i);
                else
                    map.replace(i, map.get(i)-1);
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
