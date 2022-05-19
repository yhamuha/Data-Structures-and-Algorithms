package misc.a__xTraining.multithreading;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {

        System.out.println("main thread");

        Thread t1 = new Thread(new NewThread());
        t1.start();

        Thread t2 = new Thread (new NewThread1());
        t2.start();
    }


}

class NewThread extends Thread {
    @Override
    public void run() {
        System.out.println("new thread");
    }
}

class NewThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("runable thread");
    }
}


