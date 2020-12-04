package misc.multithreading;

/**
 *        Waiting/Blocking/Sleeping
 *        /             \
 *  New -> Runnable <-> Running -> Dead
 */
public class LifeCycle {
    public static void main(String[] args)  throws Exception {
        MyThread myThread = new MyThread();

        /**
        *  interrupt();
        */
        //        myThread.interrupt();
        //
        //        try {
        //            Thread.sleep(1000);
        //        } catch (InterruptedException e) {
        //            e.printStackTrace();
        //        }

        /**
         *  yield();
         *  multithreading sheduler;
         *  from Running to Runnable;
         */
        // myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.start();
        // wait, run other thread
        // we'll have a probability for running other thread
        // but no guarantee
        //Thread.yield();

        // join() waiting to end previous thread
        // we can joined threads in this way
        myThread.join();
        System.out.println("thread main");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {

        for (int i=0; i< 50; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
