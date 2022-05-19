package misc.a__xTraining.ListStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ListStream {

    public static void main(String[] args) {

        Stream<Employee> employeeStream = Stream.of(
                new Employee(1,"a",100),
                new Employee(2,"b",200),
                new Employee(3,"c",300));
        List<Employee> employeeList = employeeStream
                .filter(e -> e.getValue() < 200)
                .collect(Collectors.toList());
        employeeList.forEach(System.out::println);
    }
}

class Employee {
    int id;
    String name;
    int value;

    public Employee(int id, String name, int value) {
        this.id = id;
        this.name = name;
        this.value = value;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}




