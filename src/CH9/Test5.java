package CH9;

public class Test5 {
    public static void main(String[] args) {
        System.out.print("1 ");
        synchronized (args) {
            System.out.print("2 ");
            try {
                args.wait();//wait will not return, so the output is "1 2"
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(3 + " ");
        }
    }
}

