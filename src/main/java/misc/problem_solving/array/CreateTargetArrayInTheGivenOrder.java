package misc.problem_solving.array;

import java.util.*;

/**
 *
 */
public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
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
}
