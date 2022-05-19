package misc.a__xTraining.polymorphism;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
    }


}

class Shape {
    void draw() {
        System.out.println("draw: shape");
    };
}

class Circle extends Shape {
    /*@Override
    public void draw() {
        System.out.println("draw: circle");
    }*/
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("draw: rectangle");
    }
}
