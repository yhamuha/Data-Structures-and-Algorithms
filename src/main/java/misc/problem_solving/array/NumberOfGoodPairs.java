package misc.problem_solving.array;

import java.util.HashMap;

/**
 *
 */
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs3(nums));
    }

    // brute force
    // O(n^2)
    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            for(int j = i+1 ; j < nums.length ; j++) {
                if(nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }

    // O(n^2)
    static  int numIdenticalPairs2(int[] nums) {
        int sums = 0, l = nums.length;

        for(int i = 0 ; i < l; i++){
            for(int j = 0 ; j < l; j++){
                if(nums[i] == nums[j] && i < j){
                    sums++;
                }
            }

        }
        return sums;
    }

    // hashmap + intuitive
    static int numIdenticalPairs3(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = nums.length;
        int counter=0;
        for(int i = 0;i<len;i++) {
            if(map.getOrDefault(nums[i],0) ==0) {
                map.put(nums[i],1);
            } else {
                int value=map.get(nums[i]);
                counter+=value;
                map.put(nums[i],value+1);

            }
        }

        return counter;
    }
}
