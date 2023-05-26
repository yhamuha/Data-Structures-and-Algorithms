package misc.java_exam.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *  Sort Employee
 */
public class DriverClass {

    /*public static void sortEmployeesByCountry(List<Employee> empList) {
        //passing sorting logic as the parameter
        empList.sort(new CountryNameComparator());
    }*/

/*    public static void sortEmployeesByCountry(List<Employee> empList) {
        empList.sort((Employee employee1, Employee employee2) -> employee1.getCountry().compareTo(employee2.getCountry()));
    }*/


    public static void main(String[] args) {
        List<Employee> empList = new ArrayList();
        empList.add(new Employee("France"));
        empList.add(new Employee("Uruguay"));
        empList.add(new Employee("Spain"));
        empList.add(new Employee("Denmark"));
        /*Comparator<Employee> comparator = (Employee employee1, Employee employee2) -> employee1.getCountry().compareTo(employee2.getCountry());
        empList.sort(comparator);*/

        /*empList.sort((employee1, employee2) -> Employee.compareByCountry(employee1, employee2));*/

        empList.sort(Employee::compareByCountry);

        /*sortEmployeesByCountry(listEmp);*/
        System.out.println(empList.toString());
    }
}
