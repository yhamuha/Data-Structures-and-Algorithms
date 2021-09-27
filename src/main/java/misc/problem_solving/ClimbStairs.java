package misc.problem_solving;

/**
 *
 */
public class ClimbStairs {
    public static void main(String[] args) {
        int high = 5;
//        System.out.println(climbStairs(high));
        System.out.println(climbStairs2(high));
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
}
