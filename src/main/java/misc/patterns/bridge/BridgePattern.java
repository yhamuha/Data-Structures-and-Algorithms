package misc.patterns.bridge;

/**
 * Bridge pattern
 * Composition over inheritance
 */
public class BridgePattern {
    public static void main(String[] args) {
        //Car car = new ToyotaCar(new CarBridge();
    }
}

abstract class Car {
    CarBridge carBridge;

    public Car(CarBridge carBridge) {
        this.carBridge = carBridge;
    }

    public abstract void drive();
}

abstract class Truck {
    CarBridge carBridge;

    public Truck(CarBridge carBridge) {
        this.carBridge = carBridge;
    }

    public abstract void drive();
}

interface CarBridge {

}

class ToyotaCar extends Car {

    public ToyotaCar(CarBridge carBridge) {
        super(carBridge);
    }

    @Override
    public void drive() {
        System.out.println("Toyota Car drive");
    }
}

class AudiCar extends Car {

    public AudiCar(CarBridge carBridge) {
        super(carBridge);
    }

    @Override
    public void drive() {
        System.out.println("Audi Car drive");
    }
}





