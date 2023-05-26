package misc.java_exam;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 */
public class IOQ {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:/tmp/output.txt");
        String data = "Learning";
        fos.write(data.getBytes());
        fos.close();
        fos = new FileOutputStream("C:/tmp/output.txt");
        data = "Java is really fun!";
        fos.write(data.getBytes());
        fos.close();
    }
}

