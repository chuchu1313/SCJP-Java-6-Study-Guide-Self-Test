package CH5;

public class Test3 {
    public static void main(String[] args){
        try {
            int x = Integer.parseInt("123");//NumberFormatException, subclass is IllegalArgumentException
        }catch(NumberFormatException e){}
    }
}
