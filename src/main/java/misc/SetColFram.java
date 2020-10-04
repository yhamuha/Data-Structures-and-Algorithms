package misc;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetColFram {
    public static void main(String[] args) {

        /*// unordered
        Set<String> hashSet = new HashSet();
        // FIFO order
        Set<String> linkedHashSet = new LinkedHashSet();
        // Lexicographic sorting
        Set<String> treeSet = new TreeSet();*/

        /*treeSet.add("Mike");
        treeSet.add("Tom");
        treeSet.add("Bryce");
        treeSet.add("Cole");
        treeSet.add("John");*/

        /*for(String name : treeSet) {
            System.out.println(name);
        }*/

        // TreeSet overrided toString();
        /*System.out.println(treeSet);

        System.out.println(treeSet.contains("John") + ", " + treeSet.contains("Tedd"));
        System.out.println(treeSet.isEmpty());*/

        Set<Integer> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);


        // union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("union: " + union);

        //intersect
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection: " + intersection);

        // substract, difference
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("difference: " + difference);

    }
}
