package misc.java_exam;

/**
 *
 */
class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is created");
    }
}

public class Bike5 extends Vehicle {
    Bike5() {
        super();
        System.out.println("Bike is created");
    }

    public static void main(String[] args) {
        Bike5 b = new Bike5();
    }
}
