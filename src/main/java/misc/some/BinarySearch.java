package misc.some;

/**
 *
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {23,54,65,76,87};
        int search = 87;
        int index = search(arr, search);
        System.out.println(index);
    }

    static int search(int[] arr, int search){
        int start = 0;
        int end = arr.length - 1;
        int i = 0;
        while((start+end)>0) {
            int mid = (start + end) / 2; //2
            if (arr[mid] == search) {
                return mid;
            } else {
                if (arr[mid] < search) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            System.out.println("Iteration: "+i);
            i++;
        }
        return -1;
    }
}