package lc.mathandgeometry.e;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    // O(log n) O(log n)
    public boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();
        int squareSum,d;
        while (inLoop.add(n)) {
            squareSum = 0;
            while (n > 0) {
                d = n%10;
                squareSum += d*d;
                n /= 10;
            }
            if (squareSum == 1)
                return true;
            else
                n = squareSum;
        }
        return false;
    }
    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(19)); // Example usage
    }
}
