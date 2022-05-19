package misc.a__xTraining.collectionApi;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 */
public class DemoComparingJava8 {
    public static void main(String[] args) {

        // using comparator through anonymous classes
        /*List<Human> humans = new ArrayList<Human>();
                humans.add (new Human("Sarah", 10));
                humans.add (new Human("Jack", 12));

        Collections.sort(humans, new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return h1.getName().compareTo(h2.getName());
            }
        });

        System.out.println(humans);*/

        List<Human> humans = new ArrayList<Human>();
        humans.add (new Human("Sarah", 10));
        humans.add (new Human("Jack", 12));
        humans.add (new Human("Alex", 12));
        humans.add (new Human("Andy", 10));
        humans.add (new Human("Sunny", 12));

        /*humans.sort(
                (Human h1, Human h2) -> h1.getName().compareTo(h2.getName()));*/

        /*humans.sort(Human::compareByNameThenAge);

        System.out.println(humans);*/

        /*humans.sort(Comparator.comparing(Human::getName).thenComparing(Human::getAge));
        System.out.println(humans);*/

        humans.stream().sorted();
        System.out.println(humans);

    }

}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int compareByNameThenAge(Human lhs, Human rhs) {
        if (lhs.name.equals(rhs.name)) {
            return Integer.compare(lhs.age, rhs.age);
        } else {
            return lhs.name.compareTo(rhs.name);
        }
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
