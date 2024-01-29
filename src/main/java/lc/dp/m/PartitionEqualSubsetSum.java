package lc.dp.m;

public class PartitionEqualSubsetSum {
    // Recursive approach
    int arr[];
    Boolean[][] cache;                              // Memoization to avoid redundant calculations
    public boolean canPartition(int[] nums) {
        int sum =0;
        arr=nums;
        for(int num:nums)
            sum+=num;
        if (sum %2 !=0)
            return false;
        int half = sum/2;
        cache = new Boolean[nums.length][half+1];
        return helper(half,0);
    }
    private boolean helper(int sum, int index){
        if (index>= arr.length || sum <0) return false;
        if(sum == 0) return true;
        if(cache[index][sum] != null){
            return cache[index][sum];
        }
        boolean take = helper(sum-arr[index], index+1);
        boolean skip = helper(sum,index+1);
        cache[index][sum] = take || skip;
        return take || skip;
    }
    public static void main(String[] args) {
        var pes = new PartitionEqualSubsetSum();
        int[] nums = {1,5,11,5};
        System.out.println(pes.canPartition(nums));
    }
}
