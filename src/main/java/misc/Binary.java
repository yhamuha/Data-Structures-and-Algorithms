package misc;
import java.util.concurrent.ThreadLocalRandom;

/**
 * <h1> Estimate running time for Binary Search </h1>
 * The class {@code Binary} implements test application that
 * simply generate random number from min to max,
 * create the big array for one thousands of elements, measure running
 * time in milliseconds and quantity of iterations.
 * <p>
 *  *
 */
public class Binary {

    /**
     * This constants describes color of element.
     */
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    /**
     * This is the main method which makes use of search method.
     * @param args Unused.
     * @return Nothing.
     */
    public static void main(String[] args) {

        int min = 0;
        int max = 1000;

        int arr[] = new int[max];
        int j = 0;
        for (int i=0; i<arr.length-1; i++) {
            arr[j] = i;
            j++;
        }
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        int search = randomNum;
        long start = System.currentTimeMillis();
        int index = search(arr, search);
        long end = System.currentTimeMillis();
        System.out.println(ANSI_BLUE + "running time: " + (end-start) + " ms" + ANSI_RESET);
        System.out.println("index of element: " + index);
    }


    /**
     * This method implemented searching elements in array 
	 * using classical Binary algorithm.
     * @param arr This is the input array to search method
     * @param search  This is the element for searching
     * @return int This returns position of searched element in array.
     */
    static int search(int[] arr, int search){
        int start = 0;
        int end = arr.length - 1;
        int i = 1;
        while((start+end)>0) {
            int mid = (start + end) / 2;
            if (arr[mid] == search) {
                return mid;
            } else {
                if (arr[mid] < search) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            System.out.println("Iteration: " + i);
            i++;
        }
        return -1;
    }
}