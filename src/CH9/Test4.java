package CH9;

public class Test4 {
    private int a;
    private int b;

    public void set(int a, int b) {
        synchronized (this){ // synchronized here is ok. Note that parameter must be an object
            this.a = a;
            this.b = b;
        }
    }

    public synchronized int read() { // synchronized here is ok
        return a + b;
    }

}
