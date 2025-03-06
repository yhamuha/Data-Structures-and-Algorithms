package lc.twopointer.m;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    // O(n) O(n)
    static int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int first=0, second=1;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i]>0) {
                ans[first] = arr[i];
                first+=2;
            } else {
                ans[second] = arr[i];
                second+=2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
    int[] nums = {3,1,-2,-5,2,-4};
    System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}
