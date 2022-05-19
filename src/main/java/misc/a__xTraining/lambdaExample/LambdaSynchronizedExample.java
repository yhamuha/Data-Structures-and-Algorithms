package misc.a__xTraining.lambdaExample;

/**
 *
 */
public class LambdaSynchronizedExample {

    private int counter;

    public void increment(){
        counter++;
    }

    public static void main() {
        LambdaSynchronizedExample lse = new LambdaSynchronizedExample();
        lse.doWork();
    }

    public void doWork() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<100; i++)
                    increment();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<100; i++)
                    increment();
            }
        });
    }
}
