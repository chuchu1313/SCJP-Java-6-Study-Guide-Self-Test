package CH5;

class MyException extends Exception{}
class Tire{
    void doStuff(){}
}

class Retread extends Tire{
    public static void main(String[] args){
        new Retread().doStuff();
    }

    void doStuff() throws RuntimeException{
        /*
        I.   void doStuff() { // Compile ok.
        II.  void doStuff() throws MyException { // Compile fail. Cannot declare wider range of exception than superclass doStuff()
        III. void doStuff() throws RuntimeException { // Compile ok.
        IV.  void doStuff() throws ArithmeticException { // Compile fail. Cannot declare wider range of exception than superclass doStuff()
         */
        System.out.println(7/0); // ArithmeticException: / by zero
    }
}

