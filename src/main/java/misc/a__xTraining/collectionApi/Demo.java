package misc.a__xTraining.collectionApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> immutableList = Collections.unmodifiableList(list);

        List<String> syncCollection = Collections.synchronizedList(Arrays.asList("a","b","c"));
        System.out.println(Arrays.toString(syncCollection.toArray()));

        List<String> uppercasedCollection = new ArrayList<>();

        Runnable listOperations = () -> {
            synchronized (syncCollection) {
                syncCollection.forEach((e) -> {
                    uppercasedCollection.add(e.toUpperCase());
                });
            }
        };
        System.out.println(Arrays.toString(uppercasedCollection.toArray()));

    }
}
