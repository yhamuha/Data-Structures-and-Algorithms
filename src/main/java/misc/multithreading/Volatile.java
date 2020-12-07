package misc.multithreading;

/**
 * volatile "keyword" = non-cashing variable
 */
public class Volatile {

    // variable i will be not cached
    // and using for both of threads
    volatile static int i;

    public static void main(String[] args) {
        // will create separate stack for thread
        new MyThreadWrite().start();

        // will create separate stack for thread
        new MyThreadRead().start();
    }

    static class MyThreadWrite extends Thread {
        @Override
        public void run() {
            while (i < 5) {
                System.out.println("increment i to " + (++i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class MyThreadRead extends Thread {
        @Override
        public void run() {
            // localVar is cached
            int localVar = i;
            while (localVar < 5) {
                if (localVar != i) {
                    System.out.println("new value of i is " + i);
                    localVar = i;
                }
            }
        }
    }
}

