package misc.multithreading;

/**
 *
 */
public class AtomicVariable {

    // non-atomic variable
    // use AtomicInteger from concurrency package
    // AtomicInteger atomicInteger = new AtomicInteger(0);

    // but today java do it implicitly for us
    static int i;

    public static void main(String[] args) throws InterruptedException {
        for (int j=0; j < 10_000; j++) {
            new AtomicVariableMyThread().start();
        }
        Thread.sleep(2_000);
        System.out.println(i);
    }

    static class AtomicVariableMyThread extends Thread {
        @Override
        public void run() {
            // atomicInteger.incrementAndGet();
            i++;
        }
    }

}
