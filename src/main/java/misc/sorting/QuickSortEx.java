package misc.sorting;

import java.util.Arrays;

public class QuickSortEx {

    public static void main(String[] args) {
        int[] array = {2,5,6,10,12,3,4};
        quicksort(array, 0, 6);
        System.out.println(Arrays.toString(array));
    }

    static int partition (int[] array, int start, int end)
    {
        int marker = start;
        for ( int i = start; i <= end; i++ )
        {
            if ( array[i] <= array[end] )
            {
                int temp = array[marker]; // swap
                array[marker] = array[i];
                array[i] = temp;
                marker += 1;
            }
        }
        return marker - 1;
    }

    static void quicksort (int[] array, int start, int end)
    {
        if ( start >= end )
        {
            return;
        }
        int pivot = partition (array, start, end);
        quicksort (array, start, pivot-1);
        quicksort (array, pivot+1, end);
    }
}
