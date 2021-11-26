package misc.func_programming;


/**
 *
 */

interface Executable2 {
    void execute();
}

class Runner {
    public void run(Executable2 e) {
        e.execute();
    }
}

class ExecutableImplementation implements Executable2 {
    @Override
    public void execute() {
        System.out.println("ExecutableImplementation");
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
        // first approach
        runner.run(new ExecutableImplementation());
        // second approach
        runner.run(new Executable2() {
            @Override
            public void execute() {
                System.out.println("Executable");
            }
        });
        //third approach
        runner.run(()-> System.out.println("from lambdas"));
    }
}
