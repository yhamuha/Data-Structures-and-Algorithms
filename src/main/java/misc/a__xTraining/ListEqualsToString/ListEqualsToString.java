package misc.a__xTraining.ListEqualsToString;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ListEqualsToString {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "A";
        person1.age = 1;

        Person person2 = new Person();
        person2.name = "A";
        person2.age = 1;


        // Initializing a list of type Linkedlist
        List<Person> l = new ArrayList<>();
        l.add(person1);
        System.out.println(l);

        // Initializing another list
        List<Person> l2 = new ArrayList<>();
        l2.add(person2);
        System.out.println(l2);

        if (l.equals(l2)) System.out.println("Equal");
        else System.out.println("Not equal");


//        l.stream().forEach(o -> System.out.println(l));
//
//        System.out.println(l.equals(l2));


    }


    }


class Person {

    String name;
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name.equals(person.name);
    }

//    @Override
//    public int hashCode() {
//        int result = name.hashCode();
//        result = 31 * result + age;
//        return result;
//    }
}
