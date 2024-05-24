package lc.arraysandhashing.e;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    // O(n) O(n)
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int val : nums1)
            set.add(val);
        for (int val : nums2) {
            if (set.contains(val))
                set2.add(val);
        }

        int[] resultArray = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            resultArray[index++] = num;
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,2,5}; int[] nums2 = {3,2,5};
        IntersectionOfTwoArrays intersectionOfTwoArray = new IntersectionOfTwoArrays();
        int[] result = intersectionOfTwoArray.intersection(nums1, nums2);
        for(int num : result) {
            System.out.print(num + " ");
        }
    }
    }
