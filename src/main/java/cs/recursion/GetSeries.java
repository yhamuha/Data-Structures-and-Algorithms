package cs.recursion;

import java.util.LinkedList;

public class GetSeries {

    // recursive tail
    void printSeries (int n, int step) {
        if (n<=0) {
            System.out.print(0);
            return;
        }
        System.out.print(n);
        printSeries(n-step, step);
    }

    // backtracking
    LinkedList<Integer> getSeries (int n, int step){
        if (n <= 0) {
            LinkedList<Integer> list = new LinkedList<>();
            list.addLast(0);
            return list;
        }
        LinkedList<Integer> result = getSeries(n-step, step);
        result.addFirst(n);
        return result;
    }

    public static void main(String[] args) {
        var gs = new GetSeries();
        int n = 5;
        int step = 2;
        System.out.println(gs.getSeries(n, step));
        gs.printSeries(n, step);
    }
}
