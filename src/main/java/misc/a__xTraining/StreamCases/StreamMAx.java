package misc.a__xTraining.StreamCases;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 *
 */
public class StreamMAx {
    public static void main(String[] args) {

        // Creating a list of integers
        /*List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
        Integer var = list.stream().min(Integer::compareTo).get();
        System.out.print(var);*/

        // list max Comparator
        /*List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
        Optional<Integer> var = list
                .stream()
                .max(Comparator.reverseOrder());
        if (var.isPresent()) {
            System.out.println(var.get());
        } else {
            System.out.println("-1");
        }*/


        // List<String> max
        /*List<String> list = Arrays.asList("x","z","a");
        String max = list
                .stream()
                .min(Comparator.comparing(String::valueOf))
                .get();
        System.out.println("max : " + max);*/


        // comparing full strings using streams and comparator
        /*String[] array = { "Seattle", "LA", "Portland"};

        Optional<String> result = Arrays
                .stream(array)
                .min(Comparator.comparing(String::valueOf));

        if (result.isPresent())
            System.out.println(result.get());
        else
            System.out.println("-1");*/
    }
}



