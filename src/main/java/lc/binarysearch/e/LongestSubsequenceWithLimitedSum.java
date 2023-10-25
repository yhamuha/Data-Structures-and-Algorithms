package lc.binarysearch.e;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
    // O(n)
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans [] = new int [queries.length];
        int prefix[] = new int [n+1];
        for(int i = 1; i<n+1; i++){
            prefix[i] = prefix[i-1]+nums[i-1];
        }
        for(int i = 0; i<queries.length; i++){
            int val = queries[i];
            ans[i] = binarySearch(val, prefix);
        }
        return ans;
    }

    public int binarySearch(int val, int [] prefix){
        int low = 0;
        int high = prefix.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(prefix[mid] == val) return mid;
            else if(prefix[mid] < val) low = mid+1;
            else high = mid-1;
        }
        if(val > prefix[high]) return high;
        return low;
    }

    public static void main(String[] args) {
        var lcs = new LongestSubsequenceWithLimitedSum();
        System.out.println(Arrays.toString(lcs.answerQueries(new int[]{4,5,2,1}, new int[]{3,10,21})));
    }
}
