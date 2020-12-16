package misc.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  Collections.synchronizedList does particular collection as sync
 *  but we need focused more around atomic/non-atomic variables !
 */
public class CollectionSynchronized {
    public static void main(String[] args) {
        SynchList synchList = new SynchList();
        synchList.add("first");

        class SynchListMyThread extends Thread {
            @Override
            public void run() {
                System.out.println(synchList.removeFirst());
            }
        }
        SynchListMyThread synchListMyThread = new SynchListMyThread();
        synchListMyThread.setName("one");
        synchListMyThread.start();
        new SynchListMyThread().start();
    }

    static class SynchList {
        private List list = Collections.synchronizedList(new ArrayList<>());

        public void add(String name) {
            list.add(name);
        }

        public synchronized String removeFirst() {
            if (list.size() > 0) {

            // focus here

                if (Thread.currentThread().getName().equals("one")) {
                    Thread.yield();
                }
                return (String)list.remove(0);
            }
            return null;
        }
    }
}
