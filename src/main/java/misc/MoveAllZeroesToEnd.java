package misc;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 0, 5, 0};
        int len = arr.length;
        int count = 0;

        // traverse array and find non-zero array
        for(int i=0; i<len; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        // add zero elements to non-zero array
        while(count < len) {
            arr[count++] = 0;
        }

        // show final array
        for(int i=0; i<len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
