package misc.a__xTraining.completableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 *
 */

public class Demo {
    public static void main(String[] args) {
        
    }

    public static CompletableFuture<Double> future () {
        CompletableFuture<Double> futureResult = new CompletableFuture<>();
        new Thread( ()-> {
            try{
                //some long process
                futureResult.complete(10.0);
            }catch(Exception e){
                futureResult.completeExceptionally(e);
            }
        }).start();
        return futureResult;
    }
}