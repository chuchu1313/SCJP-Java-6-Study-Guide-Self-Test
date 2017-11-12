package CH8;

class MyOuter {
    static int k;
    int j = 0;
    static class MyInner {
        void go() {
            k = 5;
            run();

        }
    }
    static void run(){
    }
}

public class Test1 {
    public static void main(String[] args) {
        MyOuter myouter = new MyOuter();
        new MyOuter.MyInner();

    }
}
/*
Which are true about a "static" nested class? (Choose all that apply.)
A. You must have a reference to an instance of the enclosing class in order to instantiate it // Wrong. do not need the outer instance
B. It does not have access to non-static members of the enclosing class // Correct!
C. Its variables and methods must be static // Wrong!
D. If the outer class is named MyOuter, and the nested class is named MyInner, it can be
instantiated using new MyOuter.MyInner(); // Correct
E. It must extend the enclosing class //Wrong! No need.
 */