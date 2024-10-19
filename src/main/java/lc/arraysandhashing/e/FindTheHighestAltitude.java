package lc.arraysandhashing.e;

import java.util.Arrays;

public class FindTheHighestAltitude {
    // O(n) O(n)
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length+1];
        altitude[0] = 0;
        int max = 0;
        for(int i=1; i<altitude.length; i++) {
            altitude[i] = altitude[i-1] + gain[i-1];
            if(altitude[i] > max)
                max = altitude[i];
        }
        return max;
    }

    public static void main(String[] args) {
        FindTheHighestAltitude solution = new FindTheHighestAltitude();
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(solution.largestAltitude(gain));
    }
}
