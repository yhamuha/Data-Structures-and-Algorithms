package misc.problem_solving;

import java.util.Scanner;

/**
 *
 */
public class swap_value_of_array_by_index {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter array elements: ");
        for (int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Num1: ");
        int a = sc.nextInt();
        System.out.print("Num2: ");
        int b = sc.nextInt();

        int index_a = 0, index_b = 0;
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == a) {
                index_a = i;
            }
            if (arr[i] == b) {
                index_b = i;
            }
        }

        int c = arr[index_a];
        arr[index_a] = arr[index_b];
        arr[index_b] = c;


        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
