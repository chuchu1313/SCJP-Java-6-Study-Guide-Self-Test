package CH9;

class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread x = new Thread(t); // Thread(Runnable target), Thread implements Runnable, but which is not recommended
        x.run();
    }

    @Override
    public void run() {
        for(int i = 0; i < 3; i++){
            System.out.print( i + ".."); // output 0..1..2..
        }
    }
}
