package misc.a__xTraining.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class Demo {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("things");
//        list.add("many");
//        list.add("so");
//
//        list.sort((s1, s2) -> {
//           if (s1.length() > s2.length()) {
//               return 1;
//           } else if (s1.length() < s2.length()) {
//               return -1;
//           } else {
//               return 0;
//           }
//        });
//
//        System.out.println(list);
//    }

    public static void main (String[] args) {
        /*List<String> list = new ArrayList<>();
        list.add("Los Angeles");
        list.add("Phoenix");
        list.add("Austin");

        list.sort( (s1,s2) -> {

            if (s1.length() > s2.length()) {
                return 1;
            } else if (s1.length() < s2.length()) {
                return -1;
            } else {
                return 0;
            }
        } );

        System.out.println(list);*/

        List<String> list = new ArrayList<>();
        list.add("Seattle");
        list.add("Austin");
        list.add("LA");

        // possible to use lambdas here cause
        // List.sort using Comparator interface
        // which is Functional and contains one abstract method
        list.sort ((s1, s2) -> s1.charAt(0) - s2.charAt(0));
        System.out.println(Arrays.toString(list.toArray()));
    }



}
