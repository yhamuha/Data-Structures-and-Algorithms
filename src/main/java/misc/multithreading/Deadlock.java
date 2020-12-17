package misc.multithreading;

/**
 * Having synchrinized we can have deadlocks.
 * Otherwise we can't avoid deadlock using synchrinized in this way.
 * Must avoid deadlocks
 */
public class Deadlock {
    public static void main(String[] args) {
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();
        resourceA.resourceB = resourceB;
        resourceB.resourceA = resourceA;
        ResourceAThread resourceAThread = new ResourceAThread();
        ResourceBThread resourceBThread = new ResourceBThread();
        resourceAThread.resourceA = resourceA;
        resourceBThread.resourceB = resourceB;
        resourceAThread.start();
        resourceBThread.start();
    }
}

class ResourceAThread extends Thread {
    ResourceA resourceA;
    @Override
    public void run() {
        System.out.println(resourceA.getI());
    }
}

class ResourceBThread extends Thread {
    ResourceB resourceB;
    @Override
    public void run() {
        System.out.println(resourceB.getI());
    }
}

class ResourceA {
    ResourceB resourceB;
    public synchronized int getI() {
        return resourceB.returnI();
    }
    public synchronized int returnI() {
        return 1;
    }
}

class ResourceB {
    ResourceA resourceA;
    public synchronized int getI() {
        return resourceA.returnI();
    }
    public synchronized int returnI() {
        return 2;
    }
}


