package CH9;

public class Test1 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable();
        Thread myThread = new Thread(target);
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {

    }
}
/*
A. public class MyRunnable extends Runnable{public void run(){}} // Wrong! Should use implements
B. public class MyRunnable extends Object{public void run(){}} // Wrong! Should use implements
C. public class MyRunnable implements Runnable{public void run(){}} // Correct!
D. public class MyRunnable implements Runnable{void run(){}} // Wrong! Should override, cannot modify the access modifiers
E. public class MyRunnable implements Runnable{public void start(){}} //Wrong! Should override run
 */