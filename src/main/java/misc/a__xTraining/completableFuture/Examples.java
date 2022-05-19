package misc.a__xTraining.completableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 *
 */
public class Examples {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        // 2
/*        List<Integer> list = Arrays.asList(5,9,14);

        list.stream().map(num->CompletableFuture.supplyAsync(() -> getNumber(num)))
                                    .map(CompletableFuture->CompletableFuture
                                    .thenApply(n->n*n))
                                    .map(t->t.join())
                                    .forEach(s->System.out.println(s));


    }

    private static int getNumber (int a){
        return a+a;
    }*/
        //.runAsync do not return anything
        /*CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("will run in separated thread");

            }

        });

        // block and wait
        System.out.println(future.get());
        }*/

        //.supplyAsync
    /*CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
        @Override
        public String get() {

            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "result of async computation";
        }
    });
        // block and get the result of the future
        String result = future.get();
        System.out.println(result);
    }*/

        // Creating a CompletableFuture
        /*        CompletableFuture<String> FirstNameFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Shaharyar";
        });
        // Attaching a callback to the Future using thenApply()
        CompletableFuture<String> FirstNameFuture = LastNameFuture.thenApply(firstName -> {
            return firstName + " Lalani";
        });
        // Now, Block and get the result of the future.
        System.out.println(greetingFuture.get()); // Shaharyar Lalani*/


        //.thenAccept; .thenRun   - won't return anything

        //.thenCompose
    }
}


