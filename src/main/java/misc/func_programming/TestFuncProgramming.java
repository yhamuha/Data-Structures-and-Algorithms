package misc.func_programming;


/**
 *
 */

interface Executable2 {
    int execute(int x);
}

class Runner {
    public void run(Executable2 e) {
        int a = e.execute(10);
        System.out.println(a);
    }
}


public class TestFuncProgramming {
    public static void main(String[] args) {
        /*System.out.println("~ : main");
        Thread thread0 = new Thread(() -> System.out.println("~ : thread0"));
        Thread thread1 = new Thread(() -> System.out.println("~ : thread1"));
        thread0.start();
        thread1.start();*/
        Runner runner = new Runner();
        // effectively final: won't change before using lambda
        int a = 1;
        // lambda doesn't have own scope
        runner.run((x)-> (x + a));

    }
}
