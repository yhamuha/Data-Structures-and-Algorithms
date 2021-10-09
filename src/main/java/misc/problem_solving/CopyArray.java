package misc.problem_solving;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {

        double[] inputArray = {1,2,3,4,2,2,2,3,3,12,15,6,7,8};

//        double[] resultArray = CopyArray(inputArray);

//        System.out.println(Arrays.toString(inputArray));
//        System.out.println(Arrays.toString(resultArray));

//        System.out.println(Arrays.toString(inputArray));
        double[] resultArray = ReverseArray(inputArray);
        System.out.println(Arrays.toString(resultArray));
//

//        System.out.println(isPrime(6));
//         drawHalfTriangle();
    }

    public static void drawHalfTriangle() {

        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = i; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static boolean isPrime (int N) {

        if (N<2) return false;

        for (int i = 2; i*i<= N; i++)
            if (N % i == 0) return false;
        return true;
    }

    private static double[] CopyArray(double a[]){

        double[] firstArray = a;

        int N = firstArray.length;
        double[] secondArray = new double[N];
        for (int i = 0; i < N; i++) {
            secondArray[i] = firstArray[i];
        }
        return secondArray;
    }

    private static double[] ReverseArray(double a[]){
        int N = a.length;
        for(int i=0; i< N/2; i++){
            double temp = a[i];
            a[i]=a[N-1-i];
            a[N-1-i] = temp;
        }
        return a;
    }
}