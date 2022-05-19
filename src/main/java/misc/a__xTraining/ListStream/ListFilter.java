package misc.a__xTraining.ListStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 */
public class ListFilter {
    public static void main(String[] args) {

        // filter Integer
        /*List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().filter(num -> num >= 2).forEach(System.out::print);*/

        // filter String
        /*List<String> listOfString = Arrays.asList("HEllo","fRom","java","world");
        listOfString.stream().filter(str -> Character.isUpperCase(str.charAt(1)))
                .forEach(System.out::println);*/

    }
}
