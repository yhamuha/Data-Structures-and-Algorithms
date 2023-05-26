package misc.java_exam.lambda;

import java.util.Comparator;

public class CountryNameComparator implements Comparator<Employee> {

    //overriding compare method --- sorting happens ---- country based
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getCountry().compareTo(employee2.getCountry());
    }
}