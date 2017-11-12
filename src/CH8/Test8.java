package CH8;

class TestInners{
    public static void main(String[] args) {
        new TestInners().go();
    }
    void go(){ //method-local inner class
        new A().m();
        class A{
            void m() {
                System.out.println("inner");
            }
        }
    }
    class A{ //inner class, first priority
        void m() {
            System.out.println("middle");
        }
    }
}
class A{ //outer class, second priority
    void m(){
        System.out.println("outer");
    }
}
