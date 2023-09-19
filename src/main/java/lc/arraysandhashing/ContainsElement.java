package lc.arraysandhashing;

import java.util.Arrays;

public class ContainsElement {

    public static boolean containsElement(int[] arr, int toContain) {
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, toContain);
        return (index >= 0);
    }

    public static boolean containsElementFunc(int[] arr, int toContain) {
        return Arrays.stream(arr)
                .anyMatch(e -> e == toContain);
    }

    public static void main(String[] args) {
    int[] arr = {1,2,6,0};
    int toContain = 2;
        System.out.println(containsElementFunc(arr,toContain));
    }
}
