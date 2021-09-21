package misc.computerVision;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        MaxSum ms = new MaxSum(0,0,0);
        int[] arr = {2,3,4,5,-90,7};
        System.out.println(ms.getMaxSumRange(arr).toString());
    }
}
