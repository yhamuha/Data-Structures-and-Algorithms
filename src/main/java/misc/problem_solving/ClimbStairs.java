package misc.problem_solving;

/**
 *
 */
public class ClimbStairs {
    public static void main(String[] args) {
        int high = 5;
//        System.out.println(climbStairs(high));
//        System.out.println(climbStairs2(high));
        System.out.println(climbStairs3(high));
    }

    // using recursion
    // O(n^2)
    public static int climbStairs(int high) {
        return climb_Stairs(0, high);
    }
    public static int climb_Stairs(int step, int high) {
        if (step > high) {
            return 0;
        }
        if (step == high) {
            return 1;
        }
        return climb_Stairs(step + 1, high) + climb_Stairs(step + 2, high);
    }

    // using Fibonacci Number
    // O(n), O(1)
    static int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    // dynamic approach
    // O(n), O(n)
    static int climbStairs3(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
