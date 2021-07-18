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

    public static void main(String[] args) {
        // define the array
        int[] intArray = new int[]{1,1,1,0,0,0,0,1,1,2,2,2,2,2,2};

        // calculate max sequence of '1's'
        System.out.println(FixtureClass.getMaxSetSize(intArray));
    }
}
