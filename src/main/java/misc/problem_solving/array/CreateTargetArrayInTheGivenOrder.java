package misc.problem_solving.array;

import java.util.*;

/**
 *
 */
public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(createTargetArray2(nums, index));
    }

    // O(n) 1ms; O(n)
    static int[] createTargetArray(int[] nums, int[] index) {
        int size = nums.length;
        List<Integer> out = new ArrayList<>(size);
        for(int i=0;i<size;++i){
            out.add(index[i],nums[i]);
        }
        for(int i=0;i<size;++i){
            nums[i]=out.get(i);
        }
        return nums;
    }

    // O(n) 0ms; O(1)
    static int[] createTargetArray2(int[] nums, int[] index) {
        int countInx=-1;
        int res[]=new int[nums.length];
        for(int r=0;r<res.length;r++)
            res[r]=999;
        for(int i=0;i<nums.length;i++){
            if(res[index[i]]!=999){
                for(int j=countInx;j>=index[i];j--){
                    res[j+1]=res[j];
                }
            }
            res[index[i]]=nums[i];
            countInx++;
        }
        return res;
    }
}
