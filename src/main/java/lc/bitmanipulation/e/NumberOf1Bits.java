package lc.bitmanipulation.e;

public class NumberOf1Bits {
// O(n) O(1)
public int hammingWeight(int n) {
    int cnt = 0;
    while(n != 0){
        n = n & (n-1);
        cnt++;
    }

    return cnt;
}
public static void main(String[] args) {
    NumberOf1Bits solution = new NumberOf1Bits();
    int n = 11;
    System.out.println("Hamming weight of " + n + ": " + solution.hammingWeight(n));
}
}
