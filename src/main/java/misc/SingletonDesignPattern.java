package misc;

public class SingletonDesignPattern {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}

/**
 * The {@code Singleton} class
 * implements the simpliest design pattern
 * Singletone.
 *
 * Concept:
 * We can't create more than one object of singleton.
 * Only one object.
 */
class Singleton {

    // creating Singleton object
    static Singleton singleton = new Singleton();

    //private constructor
    private Singleton() {
    }

    // return Singleton object
    public static Singleton getInstance() {
        return singleton;
    }

}

