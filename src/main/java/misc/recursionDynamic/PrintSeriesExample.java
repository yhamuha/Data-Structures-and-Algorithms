package misc.recursionDynamic;

import java.util.LinkedList;

/**
 * print series numbers from given n to 0 using step
 */
public class PrintSeriesExample {
    public static void main(String[] args) {
        printSeries(5,3);
        System.out.println(getSeries(5,3));
    }

    static void printSeries(int n, int step){
        // base case: 0 or jump 0 to -1, ...
        if (n <= 0) {
            System.out.println(0);
            return;
        }
        System.out.println(n);
        // print from n to 0
        printSeries(n-step, step);
    }

    static LinkedList<Integer> getSeries( int n, int step) {
        // base case
        if (n <= 0) {
            LinkedList<Integer> list  = new LinkedList<>();
            // put 0 to the last
            list.addLast(0);
            return list;
        }

        // get list from n-step to 0
        LinkedList<Integer> result = getSeries(n - step, step);
        // add n to start of list
        result.addFirst(n);
        return result;
    }
}
