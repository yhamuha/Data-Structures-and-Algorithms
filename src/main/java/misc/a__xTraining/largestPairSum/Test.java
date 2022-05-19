package misc.a__xTraining.largestPairSum;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 */
public class Test {

    /**
     *   _ _ _ _ _
     *   init first and second from arr[0], arr[1]
     *   traverse from 2 to arr.length(); updating first and second if needed
     *   check if arr[i] is between first and second
     *   return first + second
     */

//    static int findLargestSumPair(){
//        // init first and second
//        int first, second;
//        if (arr[0] > arr[1]) {
//            first = arr[0];
//            second = arr[1];
//        } else {
//            first = arr[1];
//            second = arr[0];
//        }
//        //traverse remaining array
//        // find first and second largest in overall array
//        for(int i=2; i<arr.length;i++) {
//            if (arr[i] > first) {
//                second = first;
//                first = arr[i];
//            }
//        //if arr[i] is between first and second then update second
//            else if (arr[i] > second && arr[i] != first) {
//                second = arr[i];
//            }
//        }
//        return first + second;
//    }

    // previous
    /*static int findLargestSumPair (int[] arr) {

        // init 0,1 elements

        int first;
        int second;

        if (arr[0] > arr[1]) {
            first = arr[0];
            second = arr[1];
        } else {
            first = arr[1];
            second = arr[0];
        }


        // traverse remaining array and set first and second

        for (int i=2; i<arr.length; i++) {

            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            if (arr[i]> second && arr[i]!= first) {
                second = arr[i];
            }
        }
        return first + second;
    }*/

    static int twoMaxSum (int[] arr) {

        int first = 0;
        int second = 0;

        if (arr[1] > arr[0]) {
            first = arr[1];
            second = arr[0];
        }

        for (int i=2; i< arr.length; i++){
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }
        return first + second;
    }

    public static void main(String[] args) {
        int arr[] = {12,34,10,6,40};

        // simply using Arrays.sort
        /*Arrays.sort(arr);
        System.out.println(arr[arr.length-1] + arr[arr.length-2]);*/


        System.out.println(twoMaxSum(arr));
    }
}
