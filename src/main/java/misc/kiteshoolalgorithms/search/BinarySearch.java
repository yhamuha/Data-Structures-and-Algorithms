package misc.kiteshoolalgorithms.search;

public class BinarySearch {
    public static void main(String[] args) {

        /*
         *   2. Binary Search
         * */

        int[] arr = {45,63,78,92,110};
        int search = 110;


        boolean toggle = true;
        int start = 0;
        int end = arr.length - 1;

        while (toggle) {
            int mid = (start + end) / 2;
            if (arr[mid] == search) {
                System.out.println(mid);
                toggle = false;
            } else {
                if (arr[mid] < search) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

    }
}
