package misc.a__xTraining.ListStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class ListSorting {

    public static void main(String[] args) {

        // list of Integers sorting
        /*List<Integer> list = Arrays.asList(-4,5,7,-5);
        list.stream().sorted().forEach(System.out::print);*/

        // list of Strings sorting
        /*List<String> list = Arrays.asList("one","two","last");
        list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);*/

        // list of Strings using Comparator.naturalOrder
        /*List<String> list = Arrays.asList("One","Two","Last");
        List<String> sortedList = list
                .stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);*/
    }
}