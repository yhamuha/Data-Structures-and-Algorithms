package lc.binarysearch.m;

public class FindMinimumInRotatedSortedArray {
    // O(log n) O(1)
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[low]<=nums[mid]){
                ans = Math.min(ans,nums[low]);
                low = mid+1;
            }
            else{
                ans = Math.min(ans, nums[mid]);
                high = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        var fmir = new FindMinimumInRotatedSortedArray();
        System.out.println(fmir.findMin(new int[] {3,4,5,1,2}));
    }
}
