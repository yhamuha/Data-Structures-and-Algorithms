package misc.a__xTraining.collectionApi;

import java.util.*;

/**
 *
 */
public class DemoShuffle {
    public static void main(String[] args) {

        // shuffling
        /*List<String> list = Arrays.asList("A", "B", "C", "D");
        System.out.println("List before Shuffle : "+list);
        Collections.shuffle(list);
        System.out.println("List after shuffle : "+list);*/

        // sorting
        // we can use Collections.sort(list)
        // or Collections.sort(list, comparator)
        /*ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("F");
        al.add("D");
        al.add("I");
        al.add("S");
        al.add("Q");


        *//* Collections.sort method is sorting the
        elements of ArrayList in ascending order. *//*
        Collections.sort(al);

        // Let us print the sorted list
        System.out.println("List after the use of" +
                " Collections.sort() :\n" + al);*/

        // search
        /*List<Integer> listNumbers = Arrays.asList(31, 87, 22, 45, 12, 98, 3, 6, 7);
        Integer max = Collections.max(listNumbers);
        System.out.println("Maximum number: " + max);*/

        // search with comparator
        /*List<String> listCities = Arrays.asList("London", "Paris", "New York",
                "Washington", "Tokyo", "Rio De Janero", "Bangalore");

        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };

        String max = Collections.max(listCities, comparator);

        System.out.println("Most-letter city name: " + max);*/

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("X");
        list.add("H");
        list.add("K");
        list.add("M");

        Comparator<String> comparator = (s1, s2) -> s1.length() - s2.length();

        String min = Collections.min(list,comparator);
        System.out.println(min);
    }
}
