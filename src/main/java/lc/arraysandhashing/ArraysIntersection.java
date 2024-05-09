package lc.arraysandhashing;

import java.util.*;

public class ArraysIntersection {
    // O(m+n) O(m+n)
    public static int[] arraysIntersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int val : nums1)
            set.add(val);
        for (int val : nums2) {
            if (set.contains(val))
                set2.add(val);
        }
        // int[] ints = set2.stream().mapToInt(Integer::intValue).toArray();
        int[] ints = new int[set2.size()];
        int index = 0;
        for (Integer num : set2) {
            ints[index] = num.intValue();
            index++;
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {4,5,6};
        System.out.println(Arrays.toString(arraysIntersection(nums1, nums2)));
    }
}
