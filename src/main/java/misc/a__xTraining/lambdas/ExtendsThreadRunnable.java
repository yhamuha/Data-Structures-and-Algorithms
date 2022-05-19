package misc.a__xTraining.lambdas;

/**
 *
 */
public class ExtendsThreadRunnable {
    public static void main (String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyThread myThread2 = new MyThread();
//        myThread2.start();

        Thread thread = new Thread(new Runner());
        thread.start();
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("myRunner " + i);
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i=0; i<5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("myThread " + i);
        }
    }
}
