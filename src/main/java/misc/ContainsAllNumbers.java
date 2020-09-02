package misc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ContainsAllNumbers {

    static boolean containsAllNumbers(String path, int start, int end) throws FileNotFoundException {
        int numberCount = end - start + 1;
        int counter = 0;

        Scanner in = new Scanner(new FileReader(path));
        while (in.hasNextInt()) {
            int number = in.nextInt();
            if (number >= start && number <= end) counter++;
        }
        in.close();
        return numberCount == counter;
    }

    public static void main(String[] args) {

        String path = "C:/tmp/numbers.txt";
        try {
            System.out.println(containsAllNumbers(path, 3, 8));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
