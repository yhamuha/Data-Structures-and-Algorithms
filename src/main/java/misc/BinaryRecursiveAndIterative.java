package misc;

public class BinaryRecursiveAndIterative {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 12, 34, 67, 89};
        System.out.println(binarySearchIterative(arr, 84));
        System.out.println(binarySearchRecursive(arr, 5, 2, 6));
    }

    public static boolean binarySearchRecursive(int[] array, int x, int left, int right) {
        if (left > right) {
            return false;
        }
        int mid = left + ((right - left) / 2);
        if (array[mid] == x) {
            return true;
        } else if (x < array[mid]) {
            return binarySearchRecursive(array, x, left, mid - 1);
        } else {
            return binarySearchRecursive(array, x, mid + 1, right);
        }
    }

    public static boolean binarySearchIterative(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {

            int mid = ((right - left) / 2);
            if (array[mid] == x) {
                return true;
            } else if (x < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}