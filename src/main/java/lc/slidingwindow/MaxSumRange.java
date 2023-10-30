package lc.slidingwindow;

public class MaxSumRange {
    public int start;
    public int end;
    public int sum;

    public MaxSumRange() {
    }

    public MaxSumRange(int start, int end, int sum) {
        this.start = start;
        this.end = end;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "MaxSumRange{" +
                "start=" + start +
                ", end=" + end +
                ", sum=" + sum +
                '}';
    }

    // 2,-8,3,-2,4,-10
    // get sub array with maxSum: start, end indexes and sum
    MaxSumRange getMaxSumRange (int[] arr) {
        if (arr== null || arr.length == 0) return null;
        int windowStart = 0;
        int windowEnd =0;
        int currSum =0;
        MaxSumRange maxSumRange = new MaxSumRange(windowStart,windowEnd, arr[0]);
        while (windowEnd < arr.length) {
            currSum += arr[windowEnd];
            if (currSum > maxSumRange.sum)
                maxSumRange = new MaxSumRange(windowStart, windowEnd, currSum);
            if(currSum <=0) {
                currSum = 0;
                windowStart = windowEnd+1;
            }
            windowEnd++;
        }
        return maxSumRange;
    }

    public static void main(String[] args) {
        MaxSumRange msr = new MaxSumRange();
        System.out.println(msr.getMaxSumRange(new int[] {2,-8,3,-2,4,-10}));
    }

}
