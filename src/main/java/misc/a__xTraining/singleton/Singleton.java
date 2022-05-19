package misc.a__xTraining.singleton;

/**
 *
 */
//public class Singleton {
//
//    private final static Singleton singleton = new Singleton();
//
//    private Singleton(){
//
//    }
//
//    public Singleton hetInstance() {
//        return singleton;
//    }
//
//    public static void main(String[] args) {
//
//    }
//
//
//}


    // best practice
public class Singleton {

    public enum MySingleton {
        INSTANCE;
        private MySingleton() {
            System.out.println("Here");
        }
    }

    public static void main(String[] args) {
        System.out.println(MySingleton.INSTANCE);
    }


}
