package lc.dp.e;

public class ClimbingStairs {
    //O(n) O(n)
    public int climbStairs(int n){
        if (n == 1) return 1;

        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        // SC: O(n) use array space; filled in of calculated results
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        var cs = new ClimbingStairs();
        int n = 8;
        System.out.println(cs.climbStairs(n));
    }
}
