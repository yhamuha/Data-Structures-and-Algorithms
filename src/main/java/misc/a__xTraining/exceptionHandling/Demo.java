package misc.a__xTraining.exceptionHandling;

import java.io.*;

/**
 *
 */
public class Demo {
    public static void main(String[] args) throws Exception {

        try {
            File file = new File("./temp.txt");
            InputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw new Exception();
        } catch (IOException e) {
            System.out.println("IO Exception");
        }

    }
}
