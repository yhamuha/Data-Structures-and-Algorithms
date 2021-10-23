package misc.problem_solving;

/**
 *
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(isPowerOfTwo(n));
    }

    static boolean isPowerOfTwo(int n) {
        long i=1;
        while(i<n)
            i = i<<1;

        return i==n;
    }
}
