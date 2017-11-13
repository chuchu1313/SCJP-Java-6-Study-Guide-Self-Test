package CH5;

class Gotcha{
    public static void main(String[] args){
        /*
         I. new Gotcha().go(); // Compile ok, but endless (Exception)
         II.  try { new Gotcha().go(); } //  Compile ok
         catch (Error e) { System.out.println("ouch"); } // StackOverflowError, Show ouch
         III. try { new Gotcha().go(); } // Compile ok
         catch (Exception e) { System.out.println("ouch"); }// cannot catch
         */
    }
    void go(){
        go();
    }
}