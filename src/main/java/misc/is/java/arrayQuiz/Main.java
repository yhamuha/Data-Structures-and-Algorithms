package misc.is.java.arrayQuiz;

public class Main {

    public static void main(String[] args) {

        //array init
        /*
        //int myArray1[5];
        int myArray2[];
        int myArray3[]=new int[5];
        //int myArray4[5]=new int[5];
        int []myArray5=new int[5];
        //int myArray6[]=new int[];
        int myArray7[]=null;
        */

        // 1
        /*
        int arr[] = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = 6;
        n = arr[arr[n] / 2];
        System.out.println(arr[n] / 2);
        */

        // 10.333333 0
        /*
        int sum = 0, count = 0;
        int[] sales = { 6, 9, 7, 10, 11, 9, 7, 12, 14, 15, 13, 11 };
        for (int index = 0; index < sales.length; index++) {
            sum += sales[index];
        }
        float average = (float) sum / sales.length;
        for (int sale : sales) {
            if (sale > average)
                count++;
            break;
        }
        System.out.println("Average sales: " + average);
        System.out.println("Sales above average: " + count);
        */

        // 19 17 15
        /*
        int a[] = { 12, 15, 16, 17, 19, 23 };
        for (int i = a.length - 1; i > 0; i--) {
            if (i % 3 != 0) {
                --i;
            }
            System.out.println(a[i]);
        }
        */

        // 72
        /*
        int[][] inputArray = { { 3, 2, 3, 6 }, { 2, 4 }, { 9 }, { 2, 3, 4, 2 } };
        int total = 1;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 1; j < inputArray[i].length - 1; j++) {
                total *= inputArray[i][j];
            }
        }
        System.out.println("Result = " + total);
        */

        // 31
        /*
        int[][] numbers = { { 3, 2, 3, 6 }, { 2, 4 }, { 9 }, { 2, 3, 4, 2 } };
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == j)
                    continue;
                total += numbers[i][j];
            }
        }
        System.out.println("Result = " + total);
        */

    }
}
