package misc.recursionDynamic;

/**
 * print series numbers from given n to 0 using step
 */
public class PrintSeriesExample {
    public static void main(String[] args) {
        printSeries(5,3);
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
}
