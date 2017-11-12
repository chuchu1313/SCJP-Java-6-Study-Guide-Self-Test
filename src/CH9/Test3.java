package CH9;

public class Test3 {
    public static void main(String[] args) {
        printAll(args);
    }

    public static void printAll(String[] lines) {
        for(int i = 0; i < lines.length; i++){
            System.out.println(lines[i]); // Every 1 sec(at last) print lines[i]
            try{
                Thread.currentThread().sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
