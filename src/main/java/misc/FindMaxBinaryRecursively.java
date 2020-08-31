package misc;

/**
 * Function which return
 * max element of array
 * recursively
 */
public class FindMaxBinaryRecursively {

    static int findMaxBinary(int[] arr, int start, int end) {
        // base case
        if (start == end) return arr[start];
        // have a middle element
        int middle = (start + end) / 2;
        // recursion: find max elem from start to middle
        int leftMax = findMaxBinary(arr, start, middle);
        // recursion: find max elem from middle to end
        int rightMax = findMaxBinary(arr, middle+1, end);
        return leftMax > rightMax ? leftMax : rightMax;
    }


    static int findMaxBinary (int[] arr) {
        return findMaxBinary(arr, 0, arr.length-1);
    }

    // driver method
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 3, 2};
        System.out.println(findMaxBinary(arr));
    }
}
