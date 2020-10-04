package misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        // naturalOrderSortTest();
        ComparatorTest comparTest = new ComparatorTest();
        comparTest.comparatorImplSortTest();
    }

    // natural order
    static void naturalOrderSortTest () {

        List<String> listStr = new ArrayList<>();
        List<Integer> listInt = new ArrayList<>();

        listStr.add("A");
        listStr.add("C");
        listStr.add("B");
        listStr.add("D");
        listStr.add("F");

        listInt.add(1);
        listInt.add(5);
        listInt.add(8);
        listInt.add(6);
        listInt.add(4);

        // natural order
        Collections.sort(listStr);
        System.out.println(listStr);
        // natural order
        Collections.sort(listInt);
        System.out.println(listInt);

    }

    // using comparator
    void comparatorImplSortTest() {

        List<Person> listPerson = new ArrayList<>();

        listPerson.add(new Person (5, "Mi"));
        listPerson.add(new Person (4, "Kenneth"));
        listPerson.add(new Person (2, "Kay"));
        listPerson.add(new Person (1, "Terry"));
        listPerson.add(new Person (3, "Abrams"));

        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId())
                    return 1;
                else if (o1.getId() < o2.getId())
                        return -1;
                else return 0;
            }
        });

        System.out.println(listPerson);

    }

    class Person {
        private int id;
        private String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

    }
}
