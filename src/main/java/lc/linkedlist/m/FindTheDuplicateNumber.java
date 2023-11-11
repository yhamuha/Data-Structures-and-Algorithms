package lc.linkedlist.m;

public class FindTheDuplicateNumber {
    // Floyd
    // O(n) O(1)
    public int findDuplicate(int[] arr){
        int slowPtr = arr[0];
        int fastPtr = arr[0];

        do {
            fastPtr = arr[arr[fastPtr]];
            slowPtr = arr[slowPtr];
        } while (fastPtr != slowPtr);

        fastPtr = arr[0];

        while (fastPtr != slowPtr){
            fastPtr = arr[fastPtr];
            slowPtr = arr[slowPtr];
        }
        return fastPtr;
    }
}
