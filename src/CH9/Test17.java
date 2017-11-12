package CH9;

class Chess implements Runnable{
    @Override
    public void run() {
        move(Thread.currentThread().getId());
    }

    //synchronized void move(long id) //two different instance will not lock each other
    void move(long id)
    {
        System.out.print(id + " ");
        System.out.print(id + " ");
    }
    public static void main(String[] args){
        Chess ch = new Chess();
        new Thread(ch).start(); // different instance
        new Thread(new Chess()).start(); // different instance
    }

}
