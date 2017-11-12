package CH9;

class MyThread2 extends Thread {
    MyThread2() {
        System.out.println(" MyThread"); // 1. MyThread will be output
    }

    @Override
    public void run() {
        System.out.println(" bar");
    }

    public void run(String s) {
        System.out.println(" baz");
    }
}

class TestThread {
    public static void main(String[] args) {
        Thread t = new MyThread2() {
            //Here will call MyThreads2() constructor to create an instance.
            public void run() {
                System.out.println(" foo"); // 2. foo will be output
            }
        };
        t.start();
    }
}
