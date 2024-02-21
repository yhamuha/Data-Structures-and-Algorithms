package lc.greedy.m;

public class GasStation {
    // O(n) O(1)
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int position =0 , sum =0 , total =0;
        for(int index=0;index<gas.length;index++){
            sum += gas[index] - cost[index];
            if(sum<0){
                total+=sum;
                sum=0;
                position = index+1;
            }
        }
        total += sum;
        return total>=0?position:-1;
    }

    public static void main(String[] args) {
        var gs = new GasStation();
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(gs.canCompleteCircuit(gas, cost));
    }
}
