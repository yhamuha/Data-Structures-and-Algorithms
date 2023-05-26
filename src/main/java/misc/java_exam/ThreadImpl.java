package misc.java_exam;

/**
 *
 */
public class ThreadImpl {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        thread.setName("Welcome Thread");
        thread.start();
        System.out.println("Welcome to ");
        thread.wait(2000);
        System.out.println("Infosys");
    }
}


// Welcome to
// Exception in thread "main" java.lang.IllegalMonitorStateException