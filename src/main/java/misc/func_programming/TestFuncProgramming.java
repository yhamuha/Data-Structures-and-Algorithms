package misc.func_programming;

/**
 *
 */
public class TestFuncProgramming {
    public static void main(String[] args) {
        System.out.println("~ : main");
        Thread thread0 = new Thread(() -> System.out.println("~ : thread0"));
        Thread thread1 = new Thread(() -> System.out.println("~ : thread1"));
        thread0.start();
        thread1.start();
    }
}
