package misc.computerVision;

/**
 *
 */
public class MaxSum {
    public int start;
    public int end;
    public int sum;

    public MaxSum (int start, int end, int sum) {
        this.start = start;
        this.end = end;
        this.sum = sum;
    }

    MaxSum getMaxSumRange (int[] arr) {
        if (arr == null || arr.length == 0) return null;
        int windowStart = 0;
        int windowEnd = 0;
        int currSum = 0;
        MaxSum maxSum = new MaxSum(windowStart, windowEnd, arr[0]);

        while (windowEnd < arr.length) {
        currSum +=arr[windowEnd];

        if (currSum > maxSum.sum)
            maxSum = new MaxSum(windowStart, windowEnd, currSum);

        if (currSum < 0) {
            currSum = 0;
            windowStart = windowEnd + 1;
        }
        windowEnd++;
    }
    return maxSum;
    }

    @Override
    public String toString() {
        return "MaxSum{" +
                "start=" + start +
                ", end=" + end +
                ", sum=" + sum +
                '}';
    }
}
