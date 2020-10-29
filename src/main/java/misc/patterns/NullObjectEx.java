package misc.patterns;

import java.io.File;

/**
 * Null Object Pattern
 */
public class NullObjectEx {

    public static void main(String[] args) {
        Animal animal = getAnimal();
        animal.eat();
    }

    static Animal getAnimal() {
        try {
            if (new File("nosuchfile.txt").exists())  {
                // read file and create Lion obj
                return new Lion();
            }

        } finally {
            return new NoAnimal();
        }
    }


}

interface Animal {
    void eat() ;
}

class Lion implements Animal {

    @Override
    public void eat() {
        System.out.println("Lion eat");
    }
}

class NoAnimal implements Animal {
    public void eat() {
    }
}



