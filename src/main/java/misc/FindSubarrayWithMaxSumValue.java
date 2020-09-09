package misc;

// time complexity O(N)
public class FindSubarrayWithMaxSumValue {
    static MaxSumRange getMaxSumRange(int[] arr) {
        int currSum = 0;
        int startIndex = 0;
        MaxSumRange maxSumRange = null;

        for(int endIndex = 0; endIndex < arr.length; endIndex++) {
            currSum += arr[endIndex];

            if (maxSumRange == null || currSum > maxSumRange.maxSum)
                maxSumRange = new MaxSumRange(startIndex, endIndex, currSum);

            if (currSum <0) {
                currSum = 0;
                startIndex = endIndex + 1;
            }
        }
        return maxSumRange;
    }

    // driver method
    public static void main(String[] args) {
        int[] arr = {1, -3, 2, 4, -6, 5, 7, -5};
        System.out.println(getMaxSumRange(arr).toString());
    }
}

class MaxSumRange {
    public int start, end, maxSum;

    public MaxSumRange(int start, int end, int maxSum) {
        this.start = start;
        this.end = end;
        this.maxSum = maxSum;
    }

    @Override
    public String toString() {
        return "MaxSumRange{" +
                "start=" + start +
                ", end=" + end +
                ", maxSum=" + maxSum +
                '}';
    }
}
