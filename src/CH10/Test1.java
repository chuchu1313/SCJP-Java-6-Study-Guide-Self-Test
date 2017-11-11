package CH10;

//import static java.lang; //A. needs *
//import static java.lang.Integer; //B. needs *
import static java.lang.Integer.*; //C. ok, this program in line 11 does not use static import
//import static java.lang.Integer.*_Value; //D. illegal import
import static java.lang.Integer.MAX_VALUE; //E. OK to use MAX_VALUE

class StateTest {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
}
