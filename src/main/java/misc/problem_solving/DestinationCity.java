package misc.problem_solving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 */
public class DestinationCity {
    public static void main(String[] args) {

        // Create listOfLists in Java
        List<List<String>> items = new ArrayList<>();

        // Creating innerList
        List<String> innerList = new ArrayList<>();

        // Adding elements to innerList
        innerList.add("London");
        innerList.add("New York");

        // Adding innerList to listOfLists
        items.add(innerList);

        // Creating another inner list
        List<String> innerList2 = new ArrayList<>();

        // Adding elements to innerList2
        innerList2.add("New York");
        innerList2.add("Lima");

        // Adding innerList2 to listOfLists
        items.add(innerList2);

        // Creating another inner list
        List<String> innerList3 = new ArrayList<>();

        innerList3.add("Lima");
        innerList3.add("Sao Paolo");
        items.add(innerList3);

        System.out.println(destCity(items));

    }

    static String destCity(List<List<String>> paths) {
        if(paths == null || paths.size() <= 0)
            return null;

        HashSet<String> set = new HashSet<String>();
        for(List<String> list: paths){
            set.add(list.get(1));
        }
        for(List<String> list: paths){
            set.remove(list.get(0));
        }
        return set.iterator().next();
    }
}
