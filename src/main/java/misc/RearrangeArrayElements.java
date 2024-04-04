package misc;

public class RearrangeArrayElements {
    // T: O(n) S: O(1)
    static void rearrange(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] < 0) {
                left++;
            } else if (arr[right] >= 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { -9, 5, 1, -2, -15, 7, 12, -3, 2 };
        rearrange(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}