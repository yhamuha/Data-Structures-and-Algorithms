package misc.bitwise;

public class BitsChanger {

    // driver method
    public static void main(String[] args) {
        System.out.println(insertion (0b1010_0100_0101_1000,0b1010_0100_0100_1100, 2, 6));
    }

    static int insertion (int a, int b, int i, int j) {
        b = b << i;
        int leftMask = createAllOnesOnTheLeft(j);
        int rightMask = createAllOnesOnTheRight(i);
        int mask = mergeMasks(leftMask, rightMask);
        a = clearBits(a, mask);
        return a | b;
    }

    // mask for the left ones
    static int createAllOnesOnTheLeft (int onesCount) {
        return ~0 << (onesCount + 1);
    }

    // mask for the right ones
    static int createAllOnesOnTheRight (int onesCount) {
        return (1 << onesCount) - 1;
    }

    static int mergeMasks (int leftMask, int rightMask) {
        return leftMask | rightMask;
    }

    static int clearBits (int a, int clearMask) {
        return a & clearMask;
    }
}
