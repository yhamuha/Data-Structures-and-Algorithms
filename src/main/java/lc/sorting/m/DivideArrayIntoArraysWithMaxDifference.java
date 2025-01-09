package lc.sorting.m;

import java.util.Arrays;

public class DivideArrayIntoArraysWithMaxDifference {
    // O (n log n) O (n)
    public int[][] divideArray(int[] nums, int k) {
        int len = nums.length;
        if (len % 3 != 0) return new int[0][0];
        int[][] res = new int[len/3][3];
        Arrays.sort(nums);
        for(int i=0,m=0; i<len; i=i+3,m++){
            res[m][0] = nums[i];
            for(int j=1; j<3; j++){
                if(nums[i+j]-res[m][0]<=k)
                    res[m][j]=nums[i+j];
                else
                    return new int[0][0];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        DivideArrayIntoArraysWithMaxDifference divider = new DivideArrayIntoArraysWithMaxDifference();
        int[] nums = {1,3,4,8,7,9,3,5,1};
        int k = 3;
        int[][] result = divider.divideArray(nums, k);
        for (int[] group : result) {
            System.out.print(Arrays.toString(group) + " ");
        }
    }
}
