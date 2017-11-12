package CH9;

public class Test11 {
    synchronized void a() { // instance level lock, cannot run at once
        actBusy();
    }

    static synchronized void b() { //class level, cannot run at once
        actBusy();
    }

    static void actBusy() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final Test11 x = new Test11();
        final Test11 y = new Test11();
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int option = (int) (Math.random() * 4);
                switch (option) {
                    case 0:
                        x.a();
                        break;
                    case 1:
                        x.b();
                        break;
                    case 2:
                        y.b();
                        break;
                    case 3:
                        y.b();
                        break;
                }
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}

