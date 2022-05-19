package misc.a__xTraining.syncLAmbda;

/**
 *
 */
public class LambdaSynchronizedExample {

    private int counter;

    public synchronized void increment(){
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        LambdaSynchronizedExample lse = new LambdaSynchronizedExample();
        lse.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<1000; i++)
                    increment();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<1000; i++)
                    increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}
