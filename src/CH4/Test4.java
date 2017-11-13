package CH4;

class Feline{
    public static void main(String[] args){
        Long x = 42L;
        Long y = 44L;
        System.out.print(" " + 7 + 2 + " "); // 72
        System.out.print(foo() + x + 5 + " "); //foo425
        System.out.print(x + y +foo());// 86foo
    }
    static String foo(){return "foo";}
}
