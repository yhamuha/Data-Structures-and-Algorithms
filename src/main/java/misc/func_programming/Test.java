package misc.func_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("T");
        list.add("Th");

       /* list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(list);*/


    }
}
