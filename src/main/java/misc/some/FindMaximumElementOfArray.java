package misc.some;

/**
 * needs fixing
 */
public class FindMaximumElementOfArray {

    static int findMax(int arr[], int low, int high)
    {

        if (high < low)
            return arr[0];

        if (high == low)
            return arr[low];

        int mid = low + (high - low) / 2;

        if (mid < high && arr[mid + 1] < arr[mid])
        {
            return arr[mid];
        }

        if (mid > low && arr[mid] < arr[mid - 1])
        {
            return arr[mid - 1];
        }

        if (arr[low] > arr[mid])
        {
            return findMax(arr, low, mid - 1);
        }
        else
        {
            return findMax(arr, mid + 1, high);
        }
    }

    public static void main(String[] args)
    {
        int arr[] = { 5, 6, 1, 2, 3, 4, 10 };
        int n = arr.length;
        System.out.println(findMax(arr, 0, n - 1));
    }

}
