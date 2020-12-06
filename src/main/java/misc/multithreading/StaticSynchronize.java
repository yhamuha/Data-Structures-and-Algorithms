package misc.multithreading;

/**
 *  Demonstrate different type of synchronized
 *  on a .class level
 *  and
 *  on a .this level
 */
public class StaticSynchronize {
}

class ResourceForStaticSynchronize {

    static int i;

    public static void changeStaticI() {
        // synchronize on a class level
        synchronized (ResourceForStaticSynchronize.class) {

            int i = ResourceForStaticSynchronize.i;
            if (Thread.currentThread().getName().equals("one")) {
                Thread.yield();
            }
            i++;
            ResourceForStaticSynchronize.i = i;
        }
    }

    public void changeI() {
        // synchronize
        synchronized (this) {
            int i = this.i;
            if (Thread.currentThread().getName().equals("one")) {
                Thread.yield();
            }
            i++;
            this.i = i;
        }
    }
}
