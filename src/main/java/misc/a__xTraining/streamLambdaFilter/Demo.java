package misc.a__xTraining.streamLambdaFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {

        // stream.filter() to filter a List,
        // and collect() to convert a stream into a List.
        /*List<String> lines = Arrays.asList("one", "two", "three");

        List<String> result = lines.stream()
                .filter(line -> !"three".equals(line))
                .collect(Collectors.toList());

        result.forEach(System.out::println);*/

        // filter null value from stream
        /*Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");

        List<String> result2 = language.filter(x -> x!=null).collect(Collectors.toList());

        result2.forEach(System.out::println);*/

    }


}
