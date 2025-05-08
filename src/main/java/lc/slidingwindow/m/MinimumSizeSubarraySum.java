package lc.slidingwindow.m;

public class MinimumSizeSubarraySum {
    // O(n) O(1)
    static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int answer = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        for(int i = 0; i<n; i++){
            sum+=nums[i];
            while(sum>=target){
                answer= Math.min(answer, i-start+1);
                sum-=nums[start];
                start++;
            }
        }
        return answer == Integer.MAX_VALUE?0:answer;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target,nums));
    }
}