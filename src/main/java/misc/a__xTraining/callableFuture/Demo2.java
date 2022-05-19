package misc.a__xTraining.callableFuture;

import java.util.concurrent.*;

/**
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        // executor service
        ExecutorService executorService = Executors.newCachedThreadPool();
        // future = executorService.submit(new Callable)
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            // @override call()
            @Override
            public Integer call() throws Exception {
                return (5+10);
            }
        });
        try {
            // result = future.get()
            // future.get(10, TimeUnit.MILLISECONDS);
            Integer result = future.get();
            System.out.println(result);
            // Alt + space -> InterruptedException
        } catch ( InterruptedException e ) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
