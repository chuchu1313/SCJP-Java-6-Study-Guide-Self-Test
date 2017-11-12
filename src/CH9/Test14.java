package CH9;

public class Test14 implements Runnable {
    public static void main(String[] args) throws InterruptedException{ //t.join will throw an InterruptedException
        Thread t = new Thread(new Test14());
        t.start();
        System.out.print("m1 ");
        t.join();
        System.out.print("m2 "); //the last string will output
    }

    @Override
    public void run() {
        System.out.print("r1 ");
        System.out.print("r2 ");
    }
}
