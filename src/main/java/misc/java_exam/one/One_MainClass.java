package misc.java_exam.one;

/**
 *
 */
public class One_MainClass {
    One_MainClass(){
        System.out.println("default constr");
    }
    public One_MainClass(float a) {
        System.out.println("public constr");
    }
    protected One_MainClass(int a) {
        System.out.println("protect condtr");
    }
    private One_MainClass(double a) {
        System.out.println("private constr");       //
    }

    public static void main(String[] args) {
        new One_MainClass(4.0);
    }
}
