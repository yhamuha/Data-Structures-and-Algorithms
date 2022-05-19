package misc.a__xTraining.maxNumber;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = new int[] {22,4,31,76,5};
        System.out.println(maxNumber(arr));
    }

    static int maxNumber (int[] arr) {

        int max = 0;

        for(int i =0; i< arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
