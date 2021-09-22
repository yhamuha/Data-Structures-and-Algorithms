package misc.computerVision;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        MaxSum ms = new MaxSum(0,0,0);
        SubMatrix sm = new SubMatrix(0,0,0,0,0);
//        int[] arr = {2,3,4,5,-90,7};
//        System.out.println(ms.getMaxSumRange(arr).toString());
        int[][] arr_2d = {{1,2,-3},{4,-5,6},{7,8,9}};
        System.out.println(sm.getMaxSumMatrix(arr_2d).toString());
    }
}
