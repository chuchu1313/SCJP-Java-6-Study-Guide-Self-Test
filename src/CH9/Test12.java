package CH9;

public class Test12 {
    static Thread lauerl, hardy;
    public static void main(String[] args){
        lauerl = new Thread() {
            @Override
            public void run() {
                System.out.println("A");
                try{
                    hardy.sleep(1000); //Actually it is laurel.sleep(1000)
                } catch(Exception e){
                    System.out.println("B");
                }
                System.out.println("C");
            }
        };
        hardy = new Thread() {
            @Override
            public void run() {
                System.out.println("D");
                try{
                    lauerl.wait();
                } catch(Exception e){
                    System.out.println("Exception"); //does not get lauerl locker, so exception happens
                }
                System.out.println("F");
            }
        };
        lauerl.start();
        hardy.start();
    }
}
