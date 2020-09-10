package misc;


public class foo {

    static String isEqual ( int a, int b){
        boolean result = (a == b ? true : false);
        return Boolean.toString(result);
    }

    static void showTitle(String title) {

        String leftAlignFormat = "| %-15s |%n";

        System.out.format("+-----------------+%n");
        System.out.format(leftAlignFormat, "Test case");
        System.out.format("+-----------------+%n");

        String s = title;
        String s2 = title;

        for (int i=0; i<5; i++) {
            System.out.printf("%10s %10s %10d %n", i, s2, i+10);
        }
        }

    public static void main(String[] args) {
        int a = 4;
        int b =5;
        showTitle(isEqual(a,b));
    }
}


