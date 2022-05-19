package misc.a__xTraining.ListStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 */
public class InfiniteStream {
    public static void main(String[] args) {

        // infinite to stream
        /*IntStream infiniteNumberStream = IntStream.iterate(100, i -> i+100);
        List<Integer> integerList = infiniteNumberStream
                                    .limit(10)
                                    .boxed()
                                    .collect(Collectors.toList());
        System.out.println(integerList);*/

        // stream to List
        /*Stream<Integer> stream = Stream.of(1,2,3,4,5);
        List<Integer> list = stream.collect(Collectors.toList());
        System.out.println(list);*/

        // stream - ArrayList; toCollection (ArrayList::new)
        /*Stream<String> stream = Arrays.asList("a","b","c").stream();
        List<String> list = stream.collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list.getClass());*/

    }
}
