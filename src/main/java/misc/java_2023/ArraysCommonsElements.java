package misc.java_2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 *
 */
public class ArraysCommonsElements {

    public static void findCommon(int[] a, int[] b){

        int c =0;
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<b.length; j++) {
                if (a[i]==b[j]) {
                    c++;
                    System.out.println("common element: " + a[i]);
                }
            }
        }
        System.out.println("number of common elements is: " + c);
    }

    public static void main(String[] args) {
        int[] a = {1,2,0,4,5};
        int[] b = {1,2,3,4,5};
        findCommon(a,b);
    }
}
