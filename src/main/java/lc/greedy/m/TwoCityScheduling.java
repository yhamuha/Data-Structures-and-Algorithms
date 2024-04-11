package lc.greedy.m;

import java.util.Arrays;

public class TwoCityScheduling {
    // O (n log n) O(1)
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,
                (a, b) -> (a[0] - a[1]) - (b[0] - b[1])
        );
        int total = 0;
        for (int i = 0; i < costs.length; i++) {
            if (i < costs.length / 2) {
                total += costs[i][0];
            } else {
                total += costs[i][1];
            }
        }
        return total;
    }
    public static void main(String[] args) {
        TwoCityScheduling scheduler = new TwoCityScheduling();
        int[][] costs = {{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}};
        int minCost = scheduler.twoCitySchedCost(costs);
        System.out.println(minCost);
    }
}
