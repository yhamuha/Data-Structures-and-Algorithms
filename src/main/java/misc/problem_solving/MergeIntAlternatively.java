package misc.problem_solving;

import java.util.Arrays;

/**
 *
 */
public class MergeIntAlternatively {
    public static void main(String[] args) {
        int[] x = {1,2,0,0};
        int[] y = {8,9};
        System.out.println(mergeIntAlternatively(x,y));
    }

    static String mergeIntAlternatively(int[] x, int[] y) {

        StringBuilder sb = new StringBuilder();

        int k = x.length < y.length ? x.length : y.length;
        for (int i = 0; i < k; i++) {
            for (int j=i; j<=i; j++) {
                sb.append(x[i]);
                sb.append(y[i]);
            }
        }

        if (x.length > y.length) {

            for (int i=y.length; i<x.length; i++) {
                sb.append(x[i]);
            }

        } else {
            for (int i=x.length; i<y.length; i++) {
                sb.append(y[i]);
            }
        }
        return sb.toString();
    }
}

