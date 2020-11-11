package misc.some;

/**
 *
 */
public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int arr[] = {1,6,0,3,8,9,0,2};
        int len = arr.length;
        int count = 0;

        // Traverse an array
        for(int i=0; i<len; i++) {
            if(arr[i] !=0) {
                // put to second array elements different from 0
                arr[count++] = arr[i];
            }
        }

        //Put zeroes at the end of an array
        while (count < len) {
            arr[count++] = 0;
        }

        // show the array
        for (int j=0; j<len; j++){
            System.out.println(arr[j]);
        }

    }
}
