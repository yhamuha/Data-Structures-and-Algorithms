package misc.problem_solving.array;

import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));

    }

    // O(n), O(n)
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        Boolean[] boolArray = new Boolean[candies.length];
        Arrays.fill(boolArray, Boolean.FALSE);

        int max = 0;
        for (int i=0; i<candies.length; i++) {
            if(candies[i] > max) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++){
            if ((candies[i] + extraCandies) >= max) {
                boolArray[i] = Boolean.TRUE;
            }
        }

        return Arrays.asList(boolArray);
    }
}
