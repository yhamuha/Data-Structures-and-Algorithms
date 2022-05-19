package misc.a__xTraining.callableFutureMultithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        es.submit(()-> {
            System.out.println("starting..");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("finished");
        });
        es.shutdown();
    }
}
