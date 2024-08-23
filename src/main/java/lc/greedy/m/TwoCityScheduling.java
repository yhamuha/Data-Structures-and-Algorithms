package lc.greedy.m;

import java.util.Arrays;

public class TwoCityScheduling {
    // O (n) O(1)
    public int twoCitySchedCost(int[][] costs) {
        int total = 0;
        for (int i = 0; i < costs.length; i++) {
            if (i < costs.length / 2)
                total += costs[i][0];
            else
               total += costs[i][1];
        }
        return total;
    }
    public static void main(String[] args) {
        TwoCityScheduling scheduler = new TwoCityScheduling();
        int[][] costs = {{10,20},{30,200},{400,50},{30,20}};
        int minCost = scheduler.twoCitySchedCost(costs);
        System.out.println(minCost);
    }
}
