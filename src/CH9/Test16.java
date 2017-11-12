package CH9;

class ChicksYack implements Runnable {
    Chicks c;

    public static void main(String[] args) {
        new ChicksYack().go();
    }

    void go() {
        c = new Chicks();
        System.out.println(this.c == null);
        new Thread(new ChicksYack()).start();//Here new ChicksYack() object, which has c null
        new Thread(new ChicksYack()).start();//Here new another ChicksYack() object, which has c null
    }

    @Override
    public void run() {
        System.out.println(c == null);
        c.yack(Thread.currentThread().getId());// C is null, so will get nullPointerException
    }

}

class Chicks {
    synchronized void yack(long id) {
        for (int x = 1; x < 3; x++) {
            System.out.print(id + " ");
            Thread.yield(); //The same instance. Though there is calling yield(), but will release the key after finishing running yack()
        }
    }

}
