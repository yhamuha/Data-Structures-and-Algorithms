package lc.other;

import java.util.Arrays;

public class SwapVariablesWithoutTemporary {
    public static int[] swapByAdding(int x, int y) {
        // getting a sum
        x = x + y;
        // getting y by substract from the sum
        y = x - y;
        // getting x by substract orig value y from the sum
        x = x - y;

        // using arr to return
        int ar[] = new int[2];
        ar[0] = x;
        ar[1] = y;
        return ar;
    }

    // the same but using XOR
    public static int[] swapByXor(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        int ar[] = new int[2];
        ar[0] = x;
        ar[1] = y;
        return ar;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println(Arrays.toString(swapByAdding(x,y)));
        int x2 = 3;
        int y2 = 4;
        System.out.println(Arrays.toString(swapByXor(x2,y2)));
    }

}
