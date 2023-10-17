package lc.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    // O(n) O(n)
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> setOfJewels = new HashSet<>();
        for (int i=0; i< jewels.length(); i++) {
            setOfJewels.add(jewels.charAt(i));
        }
        int score = 0;
        for (int i=0; i< stones.length(); i++) {
            if (setOfJewels.contains(stones.charAt(i))) score++;
        }
        return score;
    }

    public static void main(String[] args) {
        JewelsAndStones jas = new JewelsAndStones();
        String jewels = "aAc";
        String stones = "AaaaABbcccCC";
        System.out.println(jas.numJewelsInStones(jewels,stones));
    }
    }


// jewels "aAc"
// stones "AaaaABbcccCC"

// score 8

// TC: O(n+m); SC: O(n)
