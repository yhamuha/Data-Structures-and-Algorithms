package misc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Facade Design Pattern
 * process of hiding significant or any functionalities
 * behind regular interface
 * in our case behind "readFile" method of class
 */
public class FacadeDesignPattern {
    public static void main(String[] args) {
        FileReaderFacade fileReaderFacade = new FileReaderFacade();
            fileReaderFacade.readerFile("temp.txt");
    }

}

class FileReaderFacade {

    void readerFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String strCurrentLine;

            while ((strCurrentLine = br.readLine()) != null) {
                System.out.println(strCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

