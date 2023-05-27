package onemoretime.arraysIntersection;

import java.util.HashSet;

// using HashSet DS
public class IntersectionTwoArrays {
    public static int[] interSection (int[] num1, int[] num2) {
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
        int[] intersection = new int[intersectionSet2.size()];
        int index = 0;
        for (int num : intersectionSet2) {
            intersection[index++] = num;
        }
        return intersection;
    }
    public static void main (String[] str) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {1,2};
        int[] interSection = interSection(num1, num2);
        System.out.println ("Intersection of two array is: ");
        for (int num : interSection) {
            System.out.print (num + " ");
        }
    }
}

