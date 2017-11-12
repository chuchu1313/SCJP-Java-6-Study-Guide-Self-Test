package CH8;

class Navel{
    private int size = 7;
    private static int length = 3;

    public static void main(String[] args){
        new Navel().go();
    }
    void go(){
        int size = 5;
        System.out.println(new Gazer().adder()); //output 21
    }
    class Gazer{
        int adder(){
            return size * length; //inner class can access outer private instance variable
        }

    }
}
