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

    public static void main(String[] args) {
        // define the array
        int[] intArray = new int[]{1,1,1,0,0,0,0,1,1,2,2,2,2,2,2};

        // calculate max sequence of '1's'
        System.out.println(FixtureClass.getMaxSetSize(intArray));
    }
}
