package lc.arraysandhashing.m;

public class SingleNumber {
    // O(n) O(1)
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(Integer i : nums){
            ans ^= i;
        }
        return ans;
    }
    public static void main(String[] args){
        SingleNumber sn = new SingleNumber();
        int[] nums = {1,1,4};
        System.out.println(sn.singleNumber(nums));
    }
}
