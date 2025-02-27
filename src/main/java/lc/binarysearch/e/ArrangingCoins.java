package lc.binarysearch.e;

public class ArrangingCoins {
    // O(log n) O(1)
    static int arrangeCoins(int n) {
        long left = 1, right = n;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sum = mid * (mid + 1) / 2;
            if (sum == n) return (int) mid;
            else if (sum < n) left = mid + 1;
            else right = mid - 1;
        }
        return (int) right;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(arrangeCoins(n));
    }
}
