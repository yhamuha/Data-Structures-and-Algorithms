package misc.patterns;

/**
 *
 */
public class Factory {
    public static void main(String[] args) {
        Factory2 factory2 = new Factory2();
        Car2 toyota = factory2.create("Toyota2");
        Car2 audi = factory2.create("Audi2");
        toyota.drive();
        audi.drive();
    }
}


interface Car2 {
    void drive();
}

class Toyota2 implements Car2 {
    @Override
    public void drive() {
        System.out.println("drive toyota");
    }
}

class Audi2 implements Car2 {
    @Override
    public void drive() {
        System.out.println("drive audi");
    }
}

class Factory2{
    public Car2 create(String typeOfCar2) {
        switch (typeOfCar2) {
            case "Toyota2" : return new Toyota2();
            case "Audi2" : return new Audi2();
            default: return null;
        }
    }
}

