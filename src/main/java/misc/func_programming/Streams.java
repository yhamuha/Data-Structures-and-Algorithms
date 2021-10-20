package misc.func_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

/**
 *
 */
public class Streams {
    public static void main(String[] args) {


        List<String> list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");

        Stream<String> stream = list.stream();
        stream.forEach(x -> System.out.println(x));
        // stream won't work two times
//        stream.forEach(x -> System.out.println(x));


        // here is lambda is lazy
        // with "count" it will be eager
        list.stream().filter(x-> {
            System.out.println(x);
            return x.equals("one");
        }).count();//lazy //eager


        // create collection from a stream
        Set<String> set = list.stream().collect(Collectors.toSet());
        System.out.println(set.toString());

        // map
        list.stream().map(x->x.toUpperCase());

        // flat map; few lists to one
        Stream.of(asList("one","two"), asList("three")).flatMap(x -> x.stream());

        // min, max got Optional
        int value = Stream.of(1,2).min(Comparator.comparing((x->x))).get();
        int value2 = Stream.of(1,2).min(Comparator.comparing((x->x))).get();

        // reduce
        // works as for-each and increasing acc on the each step
        int count = Stream.of(1,2,3).reduce(0, (acc, element) -> acc + element);

    }


}
