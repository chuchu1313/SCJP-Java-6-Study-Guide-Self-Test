package CH9;

public class Test9 {
    public static synchronized void main(String[] args) throws InterruptedException{
        Thread t = new Thread();
        t.start();
        System.out.println("X");
        synchronized (t){
            t.wait(10000); // if you want to call wait, you need to get the object locker(here is t).
            //If not get t, Will get an IllegalMonitorStateException
        }
        System.out.print("Y");

    }
}
