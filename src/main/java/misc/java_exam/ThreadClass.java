package misc.java_exam;

/**
 *
 */
public class ThreadClass extends Thread {
    public ThreadClass() {
        System.out.println(Thread.currentThread().getPriority());
    }
}

class Priority {
    public static void main(String[] args) {
        new ThreadClass();
    }
}