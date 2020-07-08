import java.util.Arrays;
/**
 * <h1>InsertionSort</h1>
 * The InsertionSort implements classic insertion sort algorithm.
 * <p>
 * Implementation include time estimate measurements for 50k elements.
 */
public class InsertionSort {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        int[] arr = new int[50000];
        int j=0;
        for (int i = arr.length-1; i>=0; i--) {
            arr[j]=i;
            j++;
        }
        System.out.println("input arr: \n" + Arrays.toString(arr));
        long start = System.currentTimeMillis();
        arr  = sort(arr);
        long end = System.currentTimeMillis();
        System.out.println("output arr:");
        for(int number : arr){
            System.out.print(number + " ");
        }
        System.out.println(ANSI_BLUE + "\nrunning time: " + (end - start) + " ms" + ANSI_RESET);
    }

    static int[] sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0 && (arr[j]<arr[j-1]); j--){
                int tmp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=tmp;
            }
        }
        return arr;
    }
}
