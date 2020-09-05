package misc;

public class FindPreviousClosedNumber {

    // O(1)
    void swap (int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    void reverse (int[] arr, int start, int end) {
        int swapsCount = (end - start +1) / 2;
        // O(N)
        for (int i=0; i < swapsCount; i++)
            swap(arr, start + i, end - i);
    }

    int getSwapIndexInNum(int[] num) {
        // O(N)
        for (int i=num.length - 1; i>=1; i--)
            if (num[i-1] > num[i]) return i-1;
            return -1;
        }

    int getSwapIndexInSubNum(int[] num, int swapValue){
        // through in worst case all array
        // O(N)
        for (int i=num.length -1; i>=0; i--)
            if (num[i] < swapValue) return i;
        return -1;
    }

    int[] getClosestLowerNumberDec(int[] num) {

        if (num == null) return null;
        // O(N)
        int swapIndexInNum = getSwapIndexInNum(num);
        if (swapIndexInNum == -1) return null;
        // O(N)
        int swapIndexInSubNum = getSwapIndexInSubNum(num, num[swapIndexInNum]);

        swap(num, swapIndexInNum, swapIndexInSubNum);
        // O(N)
        reverse(num, swapIndexInNum + 1, num.length -1);

        return num;
    }

    }

