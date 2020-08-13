package misc;

// Polymorphism example
// the most powerful approach in OOP

// Allowing to change a code during runtime

// Static and Dynamic method bindings:
// if method not static or final
// then compiler looking for implementation of this method
// by objects hierarchy from parent class to child class

// polymorphism is a dynamical binding

public class Polymorphism {
    void useAuto (Auto auto) {
        auto.driving();
        System.out.println(auto.getNumOfSeats());
    }
    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();

        Auto auto = new SportAuto();
        polymorphism.useAuto(auto);

    }
}

class Auto {
    public void driving() {
        System.out.println("driving");
    }

    public int getNumOfSeats() {
        return 4;
    }
}

class SportAuto extends Auto {
    @Override
    public int getNumOfSeats() {
        return 2;
    }
}