package lc.greedy.m;

import java.util.HashSet;
import java.util.Set;

public class MergeTripletsToFormTargetTriplet {
    // O(n) O(1)
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean i = false;
        boolean j = false;
        boolean k = false;

        for(int[] t : triplets) {
            if (t[0]<=target[0] && t[1]<=target[1] && t[2]<=target[2]) {
                if (t[0]==target[0]) i = true;
                if (t[1]==target[1]) j = true;
                if (t[2]==target[2]) k = true;
            }
            if (i && j && k)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        var mttftt = new MergeTripletsToFormTargetTriplet();
        int[][] triplets = {{2, 5, 3}, {1, 8, 4}, {1, 7, 5}};
        int[] target = {2,7,5};
        System.out.println(mttftt.mergeTriplets(triplets, target));
    }
}
