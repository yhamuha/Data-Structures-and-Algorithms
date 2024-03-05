package lc.bitmanipulation;

import java.util.Arrays;

public class CountingBits {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        CountingBits countingBits = new CountingBits();
        int n = 5;
        int[] result = countingBits.countBits(n);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
