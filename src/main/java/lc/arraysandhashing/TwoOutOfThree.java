package lc.arraysandhashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwoOutOfThree {
    // T: O(n) S: O(n)
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> resultList = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int num : nums2){
            if(set1.contains(num) && !resultList.contains(num))
                resultList.add(num);
            else
                set2.add(num);
        }
        for(int num : nums3){
            if(set1.contains(num) && !resultList.contains(num))
                resultList.add(num);
            if(set2.contains(num) && !resultList.contains(num))
                resultList.add(num);
        }
        return resultList;
    }
    public static void main(String[] args) {
        TwoOutOfThree solution = new TwoOutOfThree();
        int[] nums1 = {3, 1};
        int[] nums2 = {2, 3};
        int[] nums3 = {1, 2};
        List<Integer> result = solution.twoOutOfThree(nums1, nums2, nums3);
        System.out.println(result);
    }
}
