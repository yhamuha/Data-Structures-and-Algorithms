package misc.recursion;

/**
 *  The {@code FindMaxBinary} class represents
 *  a finding max element in array recursively
 */
public class FindMaxBinary {
    /**
     * Main method.
     * @param args the command-line arguments (none)
     */
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 12};
        System.out.println(findMaxBinary(arr));
    }

    /**
     * Find the max elem from array using recursion
     *
     * @param arr -  input array including int elements
     * @param start -  int of start elem
     * @param end -  int of end elem
     * @return int of max elem of array
     */
    static int findMaxBinary(int[] arr, int start, int end) {

        //base case
        if (start == end) return arr[start];
        // got a middle
        int middle = (start + end) / 2;
        // find the less step for left part of array
        int leftMax =  findMaxBinary(arr, start, middle);
        // find the less step for right part of array
        int rightMax =  findMaxBinary(arr, middle + 1, end);
        // return max as or left or right using ternary
        return leftMax > rightMax ? leftMax : rightMax;
    }

    // wrapper must be
    static int findMaxBinary(int[] arr) {
        return findMaxBinary(arr, 0, arr.length - 1);
    }
}
