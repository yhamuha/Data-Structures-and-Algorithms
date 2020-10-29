package misc.patterns;

/**
 * transform one interface to another
 */
public class Adapter {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        carWash.washCar(new Audi());
        carWash.washCar(new TruckWrap(new FordTruck()));
    }
}

// class wrapper
class TruckWrap implements Car {
    Truck truck;
    public TruckWrap(Truck truck) {
        this.truck = truck;
    }

    @Override
    public void wash() {
        truck.clean();
    }
}

// second interface
interface Truck {
    void clean();
}

// class which implements second interface
class FordTruck implements Truck {
    @Override
    public void clean() {
        System.out.println("Truck clean");
    }
}

// first interface
interface Car {
    void wash();
}

// class of first interface
class Audi implements Car {
    @Override
    public void wash() {
        System.out.println("Wash Car");
    }
}

class CarWash {
    public void washCar(Car car) {
        car.wash();
    }
}
