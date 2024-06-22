package lc.twopointer.m;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int [] ans = new int[n];
        int start =0;
        int end = 1;
        for(int i=0; i<n; i++){
            if(arr[i] >=0){
                ans[start] = arr[i];
                start+=2;
            }
            else{
                ans[end] = arr[i];
                end+=2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
    RearrangeArrayElementsBySign rearr = new RearrangeArrayElementsBySign();
    int[] nums = {3,1,-2,-5,2,-4};
    System.out.println(Arrays.toString(rearr.rearrangeArray(nums)));
    }
}
