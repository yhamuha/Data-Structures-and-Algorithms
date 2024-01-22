package lc.dp.e;

public class MinCostClimbingStairs {
    // O(n) O(1)
    public int minCostClimbingStairs(int[] cost) {
        int step1 = 0;
        int step2 = 0;
        for(int i=cost.length-1; i>=0; i--){
            int current_step = cost[i] + Math.min(step1, step2);
            step1 = step2;
            step2 = current_step;
        }
        return Math.min(step1, step2);
    }

    public static void main(String[] args) {
        var mccs = new MinCostClimbingStairs();
        int[] cost = {10,15,20};
        System.out.println(mccs.minCostClimbingStairs(cost));
    }
}
