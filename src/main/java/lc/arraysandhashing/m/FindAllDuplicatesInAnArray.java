package lc.arraysandhashing.m;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllDuplicatesInAnArray {
    // O(n) O(n)
    static List<Integer> findDuplicates_prev(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(!set.add(nums[i]))
                list.add(nums[i]);
        }
        return list;
    }

    // O(n) O(1)
    static List<Integer> findDuplicates(int[] nums) {
        int[] result = new int[2];
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]-1);
            if (nums[index] < 0) {
                result[count++] = nums[index + 1];
                if (count == 2) break;
            }
            nums[index] = -nums[index];
        }
        return Arrays.stream(result)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));

    }
}
