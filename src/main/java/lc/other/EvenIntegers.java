package lc.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EvenIntegers {

    public static List<Integer> evenIntegers(List<Integer> integers) {
        if (integers == null) {
            return Collections.EMPTY_LIST;
        }
        List<Integer> evens = new ArrayList<>();
        for (Integer nr: integers) {
            if (nr != null && nr % 2 == 0) {
                evens.add(nr);
            }
        }
        return evens;
    }

    public static void main(String[] args) {
        List<Integer> listOfInt = new ArrayList<>();
        listOfInt.add(1);
        listOfInt.add(2);
        listOfInt.add(3);
        listOfInt.add(null);
        System.out.println(evenIntegers(listOfInt));

    }
}
