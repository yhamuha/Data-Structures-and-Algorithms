package misc.a__xTraining.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.*;

/**
 *
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //
        /*Stream<Integer> stream = Stream.of(1,2,3,4);
        List<Integer> listOfInteger = new ArrayList<>();
        for(int i = 1; i<=5; i++) listOfInteger.add(i);
        listOfInteger.stream().forEach(System.out::println);*/

        // Optional
        /*Stream<Integer> numbers = Stream.of(1,2,3,4,5);
        Optional<Integer> intOptional = numbers.reduce((i, j) -> {
                                return i+j;});
        if (intOptional.isPresent()) System.out.println("sum is = "
                                + intOptional.get());*/

        // from collection to stream
        /*List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(1);
        listOfInteger.add(2);
        listOfInteger.add(5);
        listOfInteger.add(3);
        Stream<Integer> sequentialStreamOfIntegers = listOfInteger.stream();
        sequentialStreamOfIntegers.sorted(Comparator.naturalOrder())
                .collect(Collectors.toList()).forEach(System.out::println);*/

        // from stream to collection
        /*Stream<Integer> stream = Stream.of(1,2,3);
        List<Integer> list = stream.collect(Collectors.toList());
        list.stream().filter(i->i<=2).forEach(System.out::println);*/

        // map
        /*Stream<String> stream = Stream.of("ab","bc","cd");
        List<String> list = stream.map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list);*/

        // stream range skip sum
        /*System.out.println(LongStream
                .range(1,11)
                .skip(5)
                .sum());*/

        // stream sorted findFirst ifPresent
        /*Stream.of("Aba","Asa", "Aqs")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);*/

        // 5. Stream from Array, sort, filter and print
        /*String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
        Arrays.stream(names)	// same as Stream.of(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);*/

        // 6. average of an int array
        /*Arrays.stream(new int[] {2, 2, 2, 3})
//                .reduce((x,y)->x*y)
//                .map(x -> x)
                .average()
//                .forEach(System.out::println);
                .ifPresent(System.out::println);*/

        // 7. Stream from List, filter and print
        /*List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);*/

        // 8. Stream rows from text file, sort, filter, and print
        /*Stream<String> bands = Files.lines(Paths.get("c:\\tmp\\bands.txt"));
        bands
                .sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bands.close();*/

        // 9. Stream rows from text file and save to List
        /*List<String> bands2 = Files.lines(Paths.get("c://tmp//bands.txt"))
                .filter(x -> x.contains("jit"))
                .collect(Collectors.toList());
        bands2.forEach(x -> System.out.println(x));*/

        // 10. Stream rows from CSV file and count
        /*Stream<String> rows1 = Files.lines(Paths.get("c://tmp//data.txt"));
        int rowCount = (int)rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println(rowCount + " rows.");
        rows1.close();*/

        // 11. Stream rows from CSV file, parse data from rows
        /*Stream<String> rows2 = Files.lines(Paths.get("c://tmp//data.txt"));
        rows2
                .map(x -> x.split(","))
                .filter(x -> x.length == 4)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2] + "  " + x[3]));
        rows2.close();*/

        // 12. Stream rows from CSV file, store fields in HashMap
        /*Stream<String> rows3 = Files.lines(Paths.get("c://tmp//data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 4)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])));
        rows3.close();
        for (String key : map.keySet()) {
            System.out.println(key + "  " + map.get(key));
        }*/

        // 13. Reduction - sum
        /*double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("Total = " + total);*/

        // 14. Reduction - summary statistics
        /*IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                .summaryStatistics();
        System.out.println(summary);*/


    }
}
