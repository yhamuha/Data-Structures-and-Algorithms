package lc.binarysearch.e;

public class CountNegativeNumbersInASortedMatrix {
    // O(log n) O(1)
    static int countNegatives(int[][] grid) {
        int count = 0;
        for (int line[]: grid) {
            count += binarySearch(line);
        }
        return count;
    }
    static int binarySearch(int[] line) {
        int left = 0;
        int right = line.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (line[mid] >= 0)
                left = mid + 1;
            else right = mid - 1;
        }
        return line.length - left;
    }

    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][]{   {4,3,2,-1},
                                                            {3,2,1,-1},
                                                            {1,1,-1,-2},
                                                            {-1,-1,-2,-3}}));
    }
}
