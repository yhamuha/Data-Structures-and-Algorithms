package lc.arraysandhashing.m;

public class MinimumAverageDifference {
    // O(n) O(1)
    static int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        if (n==1) return nums[0]/1;
        long prefix=0, postfix=0;
        for (int i=0; i<n; i++)
            postfix+=nums[i];
        long min = Integer.MAX_VALUE;
        int index=0;
        for(int i=0; i<n; i++) {
            prefix += nums[i];
            long temp=prefix/(i+1);
            if (i+1<n)
                temp-=(postfix-prefix)/(n-i-1);
            temp=Math.abs(temp);
            if(temp<min){
                min=temp;
                index=i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] inp = {2, 5, 3, 9, 5, 3};
        System.out.println(minimumAverageDifference(inp));
    }
}
