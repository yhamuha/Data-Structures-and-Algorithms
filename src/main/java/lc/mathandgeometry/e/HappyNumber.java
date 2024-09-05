package lc.mathandgeometry.e;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    // O(log n) O(1)
    public boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<>();
        int squareSum, d;
        while(inLoop.add(n)){
            squareSum = 0;
            while(n > 0){
                d = n % 10;
                squareSum = d * d;
                n /= 10;
            }
            if (squareSum == 1) return true;
            else return false;
        }
        return false;
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(10));
    }
}
