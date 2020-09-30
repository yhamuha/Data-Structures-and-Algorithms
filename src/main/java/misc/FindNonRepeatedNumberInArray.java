package misc;

public class FindNonRepeatedNumberInArray {

    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,4,3};
        System.out.printf("%d%n", findNumber(arr));
    }

    static int findNumber(int[] arr) {
        int number = arr[0];

        for (int i =1; i < arr.length; i++) {
            number = number ^ arr[i];
        }

        return number;
    }
}
