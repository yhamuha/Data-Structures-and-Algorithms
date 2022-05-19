package misc.a__xTraining.inheritance;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        Bottom bottom = new Bottom();
        bottom.setAge(5);
//        bottom.showVar();
//        bottom.stVal;
        bottom.showVar();




//        System.out.println(bottom.stVal + 5);
    }
}


class Top {
    private String name;
    private int age;

    int stVal = 10;

    public Top() {
    }

    public Top(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Bottom extends Top {

    private String bottomName;
    private int bottomAge;

    public void showVar() {
        System.out.println(stVal);
    }

    @Override
    public String toString() {
        return "Bottom{" +
                "bottomName='" + bottomName + '\'' +
                ", bottomAge=" + bottomAge +
                '}';
    }
}