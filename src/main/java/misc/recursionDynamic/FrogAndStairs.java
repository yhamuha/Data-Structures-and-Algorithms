package misc.recursionDynamic;

/**
 *
 */
public class FrogAndStairs {
    static int pathCount = 0;

    public static void main(String[] args) {
        getPathCount(1);
        System.out.println(pathCount);
    }

    static void getPathCount(int n) {
        if (n < 0) return;
        if (n == 0) {
            pathCount++;
            return;
        }
        getPathCount(n-2);
        getPathCount(n-1);
    }

    // solution without using pathCount
    int getWaysCount (int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;

        return getWaysCount(n-2) +
                getWaysCount(n - 1);
    }


}
