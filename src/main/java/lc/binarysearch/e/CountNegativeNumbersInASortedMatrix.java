package lc.binarysearch.e;

public class CountNegativeNumbersInASortedMatrix {
    //O(n^2)
    public int countNegatives_(int[][] grid) {
        int count = 0;
        for(int i = grid.length - 1; i >= 0; i--) {
            for(int j = grid[0].length - 1; j >= 0; j--) {
                if(grid[i][j] < 0) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    // O(m log n)
    public int countNegatives(int[][] grid) {
        int cnt = 0;
        for(int arr[]:grid){
            cnt+= bs(arr);
        }
        return cnt;
    }
    public static int bs(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=0){
                start=mid+1;
            }
            else end=mid-1;
        }
        return arr.length-start;
    }


    public static void main(String[] args) {
        var cn = new CountNegativeNumbersInASortedMatrix();
        System.out.println(cn.countNegatives(new int[][]{   {4,3,2,-1},
                                                            {3,2,1,-1},
                                                            {1,1,-1,-2},
                                                            {-1,-1,-2,-3}}));
    }
}
