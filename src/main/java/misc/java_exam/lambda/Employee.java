package misc.java_exam.lambda;

/**
 *
 */
public class Employee {

    private Integer empId;
    private String empName;
    private String country;

    public Employee(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static int compareByCountry(Employee employee1, Employee employee2) {
        return employee1.getCountry().compareTo(employee2.getCountry());
    }

    @Override
    public String toString() {
        return country;
    }
}
