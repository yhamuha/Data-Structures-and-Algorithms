package lc.arraysandhashing.e;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwoOutOfThree {
    // O(n) O(n)
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> resultList = new ArrayList<>();

        HashSet<Integer> nums1Set = new HashSet<>();
        HashSet<Integer> complementarySet = new HashSet<>();

        for(int i:nums1)        // form nums1Set
            nums1Set.add(i);

        for(int num : nums2)    // check nums2 and form resultList & complemenarySet
            if(nums1Set.contains(num) && !resultList.contains(num))
                resultList.add(num);
            else
                complementarySet.add(num);

        for(int num : nums3){   // check nums3 , nums1Set, complementarySet and form resultList
            if(nums1Set.contains(num) && !resultList.contains(num))
                resultList.add(num);
            if(complementarySet.contains(num) && !resultList.contains(num))
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
