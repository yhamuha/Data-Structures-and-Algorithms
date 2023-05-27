package onemoretime.arraysIntersection;

/*
 * Intersection of two array using nested loop
 */

import java.util.HashSet;

public class Wh_IntersectionOfArrays {
    public static int[] intersection (int[] nums1, int[] nums2) {
        HashSet<Integer> intersectionSet = new HashSet();

        for(int i=0; i<nums1.length; i++) {
            for(int j=0; j<nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    intersectionSet.add(nums1[i]);
                    break;
                }
            }
        }
// convert intersection to array
        int[] intersection = new int[intersectionSet.size()];
        int index =0;
        for (int num : intersectionSet) {
            intersection[index++] = num;
        }
        return intersection;
    }

    public static void main (String[] str) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        int[] intersection = intersection(num1, num2);
        System.out.println("Intersection of the two arrays: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}
