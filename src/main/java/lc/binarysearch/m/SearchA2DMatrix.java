package lc.binarysearch.m;

public class SearchA2DMatrix {
    // O(log m*n) O(1)
    static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int mid_val = matrix[mid/n][mid % n];
            if (mid_val == target)
                return true;
            else if (mid_val < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][] {       {1,3,5,7},
                                                            {10,11,16,20},
                                                            {23,30,34,60}}, 3));
    }
}
