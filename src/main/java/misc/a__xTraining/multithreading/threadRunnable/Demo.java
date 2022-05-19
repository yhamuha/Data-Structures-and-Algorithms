package misc.a__xTraining.multithreading.threadRunnable;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {

        System.out.println("thread: " + Thread.currentThread().getName());

        Thread1 t1 = new Thread1();
        t1.start();

        Thread t2 = new Thread(new Thread2());
        t2.start();


    }


}

class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("thread: " + Thread1.currentThread().getName());
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread: " + Thread.currentThread().getName());
    }
}
