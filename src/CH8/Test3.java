package CH8;

public class Test3 {
    private class Innter{

    }
    private int d = 1;
    void go(){
        class Inner{
            void test(){
                d = 3; //can access private members of the enclosing class
            }
        }
    }
}
/*
Which are true about a method-local inner class? (Choose all that apply.) //The rule is just like locale variable
A. It must be marked final // Wrong! Can be final or abstract
B. It can be marked abstract // Correct!
C. It can be marked public // Wrong! Just lie the rule of local variable
D. It can be marked static // Wrong!
E. It can access private members of the enclosing class // Correct!
 */