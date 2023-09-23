package lc.arraysandhashing;

import misc.Intersect;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {
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
        IntersectionOfTwoArray iota = new IntersectionOfTwoArray();

    }
}
