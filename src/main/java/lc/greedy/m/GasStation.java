package lc.greedy.m;

public class GasStation {
    // O(n) O(1) #ibm
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int remains = 0, total = 0, start = 0;
        for (int i = 0; i < cost.length; i++) {
            int diff = gas[i] - cost[i];
            if (remains >= 0)
                remains += diff;
            else {
                remains = diff;
                start = i;
            }
            total += diff;
        }
        if (total >= 0)
            return start;
        else
            return -1;
    }

    public static void main(String[] args) {
        var gs = new GasStation();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(gs.canCompleteCircuit(gas, cost));
    }
}
