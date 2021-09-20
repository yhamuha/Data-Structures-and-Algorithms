package misc.computerVision;

/**
 *
 */
public class MaxSetSize {

    int getMaxSetSize (int[] arr) {
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
        int[] arr = {1,1,1,0,0,1,1,1,1,1,1};
        MaxSetSize mss = new MaxSetSize();
        System.out.println(mss.getMaxSetSize(arr));
    }


}
