package onemoretime.arraysIntersection;

/*
 * intersection of arrays using HashSet
 */

import java.util.HashSet;

public class Wh_intersectionTwoArraysUsingHash {
    public static int[] intersection (int[] num1, int[] num2) {
        HashSet<Integer> intersectionSet1 = new HashSet();
        HashSet<Integer> intersectionSet2 = new HashSet();

        for (int num : num1) {
            intersectionSet1.add(num);
        }

        for (int num : num2) {
            if (intersectionSet1.contains(num)) {
                intersectionSet2.add(num);
            }
        }

    // transform hashSet to array

        int[] intersection = new int[intersectionSet2.size()];
        int index = 0;
        for (int num : intersectionSet2) {
            intersection[index++] = num;
        }
        return intersection;

    }

    public static void main (String[] str) {
        int[] num1 = {1,2,2,1,3};
        int[] num2 = {2,2,3};
        int[] intersection = intersection(num1, num2);
        System.out.println("Intersection of two array is: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}

