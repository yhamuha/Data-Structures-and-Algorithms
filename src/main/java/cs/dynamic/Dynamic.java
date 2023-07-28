package cs.dynamic;

import java.util.LinkedList;

public class Dynamic {

    // n 5, step 2
    // 5, 3, 1, 0
    void printSeries (int n, int step) {
        if (n <= 0) {
            System.out.println(0);
            return;
        }
        System.out.println(n);
        printSeries(n-step, step);
    }

    // n 5, step 2
    // 5 -> 3 -> 1 -> 0
    LinkedList<Integer> getSeries (int n, int step) {
        if (n <= 0) {
            LinkedList<Integer> list = new LinkedList<>();
            list.addLast(0);
            return list;
        }
        LinkedList<Integer> result = getSeries(n-step, step);
        result.addFirst(n);
        return result;
    }

    // using LinkedList ref as parameter
    void getSeries (int n, int step, LinkedList<Integer> list) {
        if (n <=0) {
            list.addLast(0);
            return;
        }
        list.addLast(n);
        getSeries(n-step, step, list);
    }

    // wrapper
    void someFunc() {
        LinkedList<Integer> result = new LinkedList<>();
        getSeries(5, 2, result);
    }
}
