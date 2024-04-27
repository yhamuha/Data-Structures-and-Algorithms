package misc.recursion;

public class RecursionFindMax {
    // O(n) O(n)
    static int findMax(int[] arr, int n) {
        if (n == 1) return arr[0];
        int maxElem = findMax(arr, n - 1);
        return maxElem > arr[n - 1]
                ? maxElem
                : arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1,3,8,4,5,6};
        System.out.println(findMax(arr, 6));
    }
}
