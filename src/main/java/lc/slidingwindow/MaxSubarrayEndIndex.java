package lc.slidingwindow;

// 3,1,-4,7,0,-2
// start array in index 0; find subarray index of maxSum
// res: index 3 (as 3+1+(-4)+7=7)

public class MaxSubarrayEndIndex {
    int maxSubarrayEndIndex(int[] arr) {
        int maxSum = 0;
        int currSum = 0;
        int endIndex = 0;

        for(int i=0;i<arr.length; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
                endIndex = i;
            }
        }
        return endIndex;
    }

    public static void main(String[] args) {
        var msei = new MaxSubarrayEndIndex();
        System.out.println(msei.maxSubarrayEndIndex(new int[] {3,1,-4,7,0,-2}));
    }
}
