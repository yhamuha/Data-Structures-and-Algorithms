package misc.java_exam.one;

/**
 *
 */
public class SuperClass {

    private void displayName(){
        System.out.println("super class");
    }

    public static void main(String[] args) {
        SuperClass superClass = new Subclass();
        superClass.displayName();
    }
}

class Subclass extends SuperClass {
    private void displayName() {
        System.out.println("subclass is a type of superclass");
    }
}


/* private
*  protected
*  default
*  public
* */
