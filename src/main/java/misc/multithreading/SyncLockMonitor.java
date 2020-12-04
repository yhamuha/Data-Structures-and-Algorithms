package misc.multithreading;

/**
 *
 */
public class SyncLockMonitor {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        resource.i=5;
        ThreadForSync threadForSync = new ThreadForSync();
        ThreadForSync threadForSync2 = new ThreadForSync();
        threadForSync.setName("one");
        threadForSync.setResource(resource);
        threadForSync2.setResource(resource);
        threadForSync.start();
        threadForSync2.start();
        threadForSync.join();
        threadForSync2.join();
        System.out.println(resource.i);
    }
}

class ThreadForSync extends Thread {

    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.changeI();
    }
}

    // monitor
    class Resource {
    int i;

    // method keep the lock
    public synchronized void changeI(){
        int i = this.i;
        if (Thread.currentThread().getName().equals("one")) {
            Thread.yield();
        }
        i++;
        this.i = i;
    }
}
