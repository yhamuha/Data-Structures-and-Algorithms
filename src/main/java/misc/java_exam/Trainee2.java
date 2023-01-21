package misc.java_exam;

/**
 *
 */
class Employee {
    public static void display() {
        System.out.println("Employee");
    }
}
public class Trainee2 extends Employee {
    public static void display() {
        System.out.println("Trainee");
    }

    public static void main(String[] args) {
        Employee employee = new Trainee2();
        employee.display();
    }
}
