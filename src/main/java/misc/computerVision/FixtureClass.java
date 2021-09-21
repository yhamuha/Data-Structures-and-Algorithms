package misc.computerVision;

/**
 * essential class
 */
public class FixtureClass {

    /**
     *  getMaxSetSize(int[] arr)
     *  ========================================
     *  input: 1 0 1 1 0 0 0 0 1
     *  output: max the same sequence of 1
     */
    public static int getMaxSetSize(int[] arr) {
        int maxSetSize = 0;
        int setSize = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) setSize++;
            else setSize = 0;
            maxSetSize = Math.max(maxSetSize, setSize);
        }
        return maxSetSize;
    }

    // O(n) - complexity
    // O(1) - memory
    static int getMaxSetSizeWithGaps (int[] arr) {
        int maxSetSize = 0;
        int firstZeroIndex = -1;
        int windowStart = -1;
        int windowEnd = 0;

        while (windowEnd < arr.length) {
            if (arr[windowEnd] == 0) {
                int setSize = windowEnd - windowStart;
                maxSetSize = Math.max(maxSetSize, setSize);
                windowStart = firstZeroIndex + 1;
                firstZeroIndex = windowEnd;
            }
            windowEnd++;
        }
        if (windowStart == -1) return arr.length;
        return Math.max(maxSetSize, windowEnd - windowStart);
    }

    //       ex:
    //       index:  0 1  2 3 4 5
    //       value:  8 7 -1 2 5 6

    static int getMaxSubArrayEndIndex (int[] arr) {
        int maxSum = 0;
        int curSum = 0;
        int endIndex = 0;

        for (int i=0; i< arr.length; i++) {
            curSum += arr[i];
            if (curSum > maxSum) {
                maxSum = curSum;
                endIndex = i;
            }
        }
        return endIndex;
    }

    public static void main(String[] args) {
        // define the array
        int[] intArray = new int[]{3,1,-4,7,0,-2};

        System.out.println(getMaxSubArrayEndIndex(intArray));
    }
}
