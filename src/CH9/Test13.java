package CH9;

import java.util.Optional;

public class Test13 implements Runnable {
    void go(long id) {
        System.out.println(id);
    }

    public static void main(String[] args) {
        System.out.print(Thread.currentThread().getId() + " ");
        //new Test13().run(); // Ok, but get will the same thread id (4,4)
        //new Test13().start(); // Wrong! Cannot run runnable instance
        //new Thread(new Test13()); // Compile ok, but will not run
        //new Thread(new Test13()).run(); // Ok, but get will the same thread id (4,4)
        new Thread(new Test13()).start(); // Ok, and will get different id (4,2)
    }

    @Override
    public void run() {
        go(Thread.currentThread().getId());
    }
}
