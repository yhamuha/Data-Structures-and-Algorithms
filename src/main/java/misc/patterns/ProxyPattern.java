package misc.patterns;

/**
 *  the main idea:
 *  we have a some own code between interface
 *  and his implemented class
 */
public class ProxyPattern {
    public static void main(String[] args) {
        ICar car = new RenaultProxy();
        car.drive();
    }
}

interface ICar {
    void drive();
}

class RenaultProxy implements ICar {
    ICar car = new Renault();

    @Override
    public void drive() {
        System.out.println("Proxy code");
        car.drive();
    }
}

class Renault implements ICar {
    @Override
    public void drive() {
        System.out.println("car");
    }
}
