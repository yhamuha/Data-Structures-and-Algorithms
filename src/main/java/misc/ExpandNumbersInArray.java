package misc;

import java.util.Arrays;

public class ExpandNumbersInArray {
    static int[] expand (int[] nums){
        int resultSize = 0;
        for(int num : nums){
             resultSize += num;
        }
        int[] result = new int[resultSize];
        int index = 0;
        for (int i=0; i<nums.length; i++) {
            for(int j=1; j<=nums[i]; j++){
                result[index++] = j;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(expand(new int[] {1,2})));
    }
}
