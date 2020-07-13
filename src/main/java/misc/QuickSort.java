package misc;

/**
 * Quick Sort
 * fast, recursive, non-stable sort algorithm
 * divide and conquer principle
 *
 * performance :    O(n) best
 *                  0O(n log n) average
 *                  O(n^2) worst
 *
 * pseudo-code (algo description):
 * if one or zero elements - array is sorted
 * otherwise:
 * 1. select pivot element
 * 2. elem > pivot to one array; elem < pivot move to second array
 * 3. sort booth arrays recursively
 * 4. combine arrays
 *
 */

    public class QuickSort  {

        // quantity of lines for output
        private static int QUANTITY_OF_LINE = 30;

        private int[] numbers;
        private int number;


    public static int rand (int min, int max) {

        int range = max - min + 1;
        int rand = 0;

        // generate random numbers within 1 to 10
        for (int i = 0; i < 10; i++) {
            rand = (int)(Math.random() * range) + min;
        }
        return rand;
    }

        public void sort(int[] values) {
            // check for empty or null array
            if (values ==null || values.length==0){
                return;
            }
            this.numbers = values;
            number = values.length;
            quicksort(0, number - 1);
        }

        private void quicksort(int low, int high) {
            int i = low, j = high;
            // Get the pivot element from the middle of the list
            int pivot = numbers[low + (high-low)/2];

            // Divide into two lists
            while (i <= j) {
                // If the current value from the left list is smaller than the pivot
                // element then get the next element from the left list
                while (numbers[i] < pivot) {
                    i++;
                }
                // If the current value from the right list is larger than the pivot
                // element then get the next element from the right list
                while (numbers[j] > pivot) {
                    j--;
                }

                // If we have found a value in the left list which is larger than
                // the pivot element and if we have found a value in the right list
                // which is smaller than the pivot element then we exchange the
                // values.
                // As we are done we can increase i and j
                if (i <= j) {
                    exchange(i, j);
                    i++;
                    j--;
                }
            }
            // Recursion
            if (low < j)
                quicksort(low, j);
            if (i < high)
                quicksort(i, high);
        }
    private void exchange(int i, int j) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

    public static void main(String[] args) {

        // init array for ten thousands of elements
        int[] array = new int[10_000];
        // fill in array
        for (int i=0; i<array.length-1; i++) {
            array[i] = rand(1,1000);
        }
        // instantiating QuickSort
        QuickSort quickSort = new QuickSort();
        // invoking sort, sorted
        quickSort.sort(array);

        // foreach for output elements
        int quantityOfLine = 30;
        int counter = 0;
        for (int number : array) {
            //formatting
            System.out.printf("%-6d", number);
            counter++;
            if ((counter % QUANTITY_OF_LINE)  == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    }
