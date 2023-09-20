package lc.arraysandhashing;

import java.util.*;

public class ArraysIntersection {
    // TC: O(n+m); SC: O(n+m)
    public static int[] arraysIntersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int val : nums1) {
            set.add(val);
        }

        for (int val : nums2) {
            if (set.contains(val)) {
                set2.add(val);
            }
        }
        int[] ints = set2.stream().mapToInt(Integer::intValue).toArray();
        return ints;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {4,5,6};
        System.out.println(Arrays.toString(arraysIntersection(nums1, nums2)));
    }
}
