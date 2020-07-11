package misc;

/**
 * Builder Design Pattern
 * allowing to resolve issues
 * with set of a huge amount of different
 * signatures in constructor methods
 */
public class BuilderDesignPattern {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar.Builder("Audi").setColor("Gray").setMaxSpeed(120).build();
        System.out.println(sportCar.getName() + " " + sportCar.getColor() + " " + sportCar.getMaxSpeed());
    }
}

class SportCar{
    private String name;
    private String color;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    /*creating private constructor*/
    private SportCar(Builder builder){
        this.name = builder.name;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
    }

    /*static class for builder*/
    static class Builder {
        private String name;
        private String color;
        private int maxSpeed;

        /* important: constructor only for necessary value field*/
        public Builder(String name) {
            this.name = name;
        }

        /*field for optional value*/
        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        /*field for optional value*/
        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public SportCar build() {
            return new SportCar(this);
        }
    }
}

