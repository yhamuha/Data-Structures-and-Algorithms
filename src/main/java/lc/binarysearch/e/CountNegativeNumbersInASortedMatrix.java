package lc.binarysearch.e;

public class CountNegativeNumbersInASortedMatrix {
    // O(m log n)
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int line[]: grid) {
            count += bs(line);
        }
        return count;
    }
    private int bs(int[] line) {
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
        var cn = new CountNegativeNumbersInASortedMatrix();
        System.out.println(cn.countNegatives(new int[][]{   {4,3,2,-1},
                                                            {3,2,1,-1},
                                                            {1,1,-1,-2},
                                                            {-1,-1,-2,-3}}));
    }
}
