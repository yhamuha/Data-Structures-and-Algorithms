package misc.some;


public class FindMaximumElementOfArray {
    // O(n) O(1)
    static int findMax(int arr[]) {
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max)
                max = arr[i];
        }
        return max;
    }
    // O(log n) O(1)
    static int findInSortedArray(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,5,6,10};
        int n = arr.length;
        System.out.println(findMax(arr));
        System.out.println(findInSortedArray(arr,5));
    }

}
