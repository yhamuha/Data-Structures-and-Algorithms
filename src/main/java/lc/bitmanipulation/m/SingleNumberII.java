package lc.bitmanipulation.m;

public class SingleNumberII {
    // O(n) O(1)
    public int singleNumber(int[] nums) {
        int ones=0, twos=0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }

    public static void main(String[] args){
        SingleNumberII snII = new SingleNumberII();
        int[] nums = {2,2,3,2};
        System.out.println(snII.singleNumber(nums));
    }
}
