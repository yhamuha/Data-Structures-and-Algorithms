package lc.bitmanipulation.m;

public class GrayCode {

    public static boolean isGray(int a, int b) {
        int x = a ^ b;
        while (x > 0) {
            // x%2 check if 1 is present in the last bit
            // x>>1 check if we have another 1 in adjacent bit
            if (x % 2 == 1 && x>>1 > 0) return false;
            x = x>>1;
        }
        return true;
    }

    public static void main(String[] args) {
        int a = 1; // 00000000 00000000 00000000 00000001
        int b = 0; // 00000000 00000000 00000000 00000000
        System.out.println(isGray(a,b));
    }
}
