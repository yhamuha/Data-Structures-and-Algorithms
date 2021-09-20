package misc.problem_solving;

import java.util.Scanner;

/**
 *
 */
public class total_of_vowels {
    public static void main(String[] args) {
        char[] arr = new char[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }
        int vowel_counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (( arr[i] == 'a') || (arr[i] == 'e') || (arr[i] == 'i') || (arr[i] == 'o') || (arr[i] == 'u')) {
                vowel_counter++;
            }
        }
        System.out.println("Number of vowels: " + vowel_counter);
    }
}
