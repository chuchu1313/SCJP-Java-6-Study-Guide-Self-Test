package CH5;

class Clumsy{
    public static void main(String[] args){
        int j = 7;
        assert(++j > 7): "tttttt";
        assert(++j > 8): "hi";
        assert(j > 10): j=12;
        //assert(j == 12): doStuff(); // must have return value
        assert(j == 12): new Clumsy();
    }
    static void doStuff(){}
}
