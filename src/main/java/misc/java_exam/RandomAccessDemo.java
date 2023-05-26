package misc.java_exam;
import java.io.*;

public class RandomAccessDemo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile randomFile = new RandomAccessFile("C:\\tmp\\Output.txt", "rw");
        randomFile.writeUTF("Writing");
        System.out.println("Current position:" + randomFile.getFilePointer());
        randomFile.seek(0);
        System.out.println(randomFile.readUTF());
        System.out.println("Current position:" + randomFile.getFilePointer());
        randomFile.seek(8);
        Byte asciiValue = randomFile.readByte();
        char asciiSymbol = (char) asciiValue.byteValue();
        System.out.println("byte in position 5: " + asciiValue);
        System.out.println("it is char: " + asciiSymbol);
        System.out.println("Current position:" + randomFile.getFilePointer());

        randomFile.close();
    }
}
