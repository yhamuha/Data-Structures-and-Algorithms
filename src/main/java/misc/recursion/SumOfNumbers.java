package misc.recursion;


// how to correct write wrapper



public class SumOfNumbers {
    public static void main(String[] args) {
        int[] arr = {1,4, 6};
        //System.out.println(sum());
    }

    static int sum (int[] arr, int n) {
        if (n == 0) return 0;
        return sum(arr, n-1) + sum(arr, n-2);
    }

    /*static sum (int[] arr) {
        sum(int[] arr, int n);
    }*/


}
