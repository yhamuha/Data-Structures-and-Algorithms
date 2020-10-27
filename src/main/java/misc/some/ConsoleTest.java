package misc.some;

import java.util.Scanner;

/**
 * Scanner
 */
public class ConsoleTest {
    public static void main(String[] args) throws Exception {
        Scanner in;
        String s = "";

        while (!s.equals("exit")) {
            in = new Scanner(System.in);
            s = in.nextLine();
            System.out.println(s);
        }
    }
}
