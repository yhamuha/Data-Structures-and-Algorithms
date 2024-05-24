package lc.arraysandhashing.e;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    // T: O(n) S: O(n)
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1)
            set1.add(num);
        for (int num : nums2)
            set2.add(num);
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                a1.add(num);
            }
        }
        for (int num : set2) {
            if (!set1.contains(num)) {
                a2.add(num);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(a1);
        result.add(a2);
        return result;
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
