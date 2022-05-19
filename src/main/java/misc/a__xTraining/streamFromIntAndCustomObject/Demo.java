package misc.a__xTraining.streamFromIntAndCustomObject;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 */

class Person {
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


public class Demo {
    public static void main(String[] args) {
        whenListIsOfIntegerThenMaxCanBeDoneUsingIntegerComparator();

    }

    @Test
    public static void whenListIsOfIntegerThenMaxCanBeDoneUsingIntegerComparator(){
    // given
    List<Integer> listOfIntegers = Arrays.asList(1,2,3,4,56,7,89,10);
    Integer expectedResult = 89;

    // then
    Integer max = listOfIntegers
            .stream()
            .mapToInt(v -> v)
            .max().orElseThrow(NoSuchElementException::new);

    // assert
        assertEquals(Float.parseFloat("Should be 89 "), expectedResult, max);
    }

    @Test
    public void whenListIsOfPersonObjectThenMinCanBeDoneUsingCustomComparatorThroughtLambda() {

        // given

        Person alex = new Person("Alex", 20);
        Person john = new Person("John", 25);
        Person peter = new Person("Peter", 30);
        List<Person> people = Arrays.asList(alex, john, peter);

        // then
        Person minByAge = people
                .stream()
                .min(Comparator.comparing(Person::getAge))
                .orElseThrow(NoSuchElementException::new);

        // assert
        assertEquals("Should be Alex", alex, String.valueOf(minByAge));
    }

}




