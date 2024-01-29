package lc.dp.m;

public class PartitionEqualSubsetSum {
    // Recursive approach
    int arr[];
    public boolean canPartition(int[] nums) {
        int sum =0;
        arr=nums;
        for(int num:nums)
            sum+=num;
        if (sum %2 !=0)
            return false;
        int half = sum/2;
        return helper(half,0);
    }
    private boolean helper(int sum, int index){
        if (index>= arr.length || sum <0) return false;
        if(sum == 0) return true;
        boolean take = helper(sum-arr[index], index+1);
        boolean skip = helper(sum,index+1);
        return take || skip;
    }
    public static void main(String[] args) {
        var pes = new PartitionEqualSubsetSum();
        int[] nums = {1,5,11,5};
        System.out.println(pes.canPartition(nums));
    }
}
