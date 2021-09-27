package misc.problem_solving;

/**
 *
 */
public class ClimbStairs {
    public static void main(String[] args) {
        int high = 5;
        System.out.println(climbStairs(high));
    }
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
}
