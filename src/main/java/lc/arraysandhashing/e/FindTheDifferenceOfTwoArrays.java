package lc.arraysandhashing.e;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    // O(n) O(n)
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> setOfNums1 = new HashSet<>();
        Set<Integer> setOfNums2 = new HashSet<>();
        for(int num : nums1)
            setOfNums1.add(num);
        for(int num : nums2)
            setOfNums2.add(num);
        List<Integer> distinctNums1InNums2List = new ArrayList<>();
        List<Integer> distinctNums2InNums1List = new ArrayList<>();
        for(int num : nums1)
            if(!setOfNums2.contains(num))
                distinctNums1InNums2List.add(num);
        for(int num : nums2)
            if(!setOfNums1.contains(num))
                distinctNums2InNums1List.add(num);
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(distinctNums1InNums2List);
        resultList.add(distinctNums2InNums1List);
        return resultList;
    }

    public static void main(String[] args) {
        FindTheDifferenceOfTwoArrays finder = new FindTheDifferenceOfTwoArrays();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> difference = finder.findDifference(nums1, nums2);
        System.out.println("Difference of the two arrays:");
        for (List<Integer> list : difference) {
            System.out.println(list);
        }
    }
}
