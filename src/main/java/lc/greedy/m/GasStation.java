package lc.greedy.m;

public class GasStation {

    /*public int canCompleteCircuit(int[] gas, int[] cost) {
        int remaining=0;
        int total=0;
        int start=0;

        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            if(remaining>=0){
                remaining+=diff;
            }
            else{
                remaining=diff;
                start=i;
            }
            total+=diff;
        }
        if(total>=0){
            return start;
        }
        else{
            return -1;
        }
    }*/

    // O(n)
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
