package misc.problem_solving;

import java.util.Arrays;

/**
 *
 */
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    //O(n), O(1)
    static int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int[] ans=new int[2*len];
        for(int i=0;i<len;i++){
            ans[i]=nums[i];
            ans[i+len]=nums[i];
        }
        return ans;
    }
}
