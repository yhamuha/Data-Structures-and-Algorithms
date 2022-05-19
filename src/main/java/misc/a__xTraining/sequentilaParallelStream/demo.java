package misc.a__xTraining.sequentilaParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 */
public class demo {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);

//        Stream<Integer> seqStream = myList.stream();
        Stream<Integer> highNums = myList.stream().filter(p -> p > 90);
        highNums.forEach(p -> System.out.println("high nums is sequencies mode = " + p));
    }
}
