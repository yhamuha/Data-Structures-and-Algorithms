package lc.bitmanipulation.m;

public class BitwiseANDOfNumbersRange {
    // O(log right) O(1)
    public static int rangeBitwiseAnd(int left, int right) {
        int shifts = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shifts++;
        }
        return left << shifts;
    }

    public static void main(String[] args) {
        int left = 5;
        int right = 7;
        System.out.println(rangeBitwiseAnd(left, right));
    }
}
