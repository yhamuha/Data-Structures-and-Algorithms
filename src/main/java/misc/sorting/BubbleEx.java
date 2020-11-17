package misc.sorting;

/**
 *
 */
public class BubbleEx {

    public static void main(String[] args) {
        int[] arr = new int[100_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        long start = System.currentTimeMillis();
        arr  = sort(arr);
        long end = System.currentTimeMillis();
        System.out.println("Bubble sort:");
        System.out.println("Execution time for " + arr.length + "  elements of array is: "
                + (end - start) + " ms");
    }

    /**
     * Bubble sort
     * @param arr
     * @return
     */
    static int[] sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=arr.length-1; j>i; j--){
                if(arr[j]<arr[j-1]){

                    // swap
                    int tmp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                }
            }
        }
        return arr;
    }
}
