package CH5;


class Frisbee{
    public static void main(String[] args){
        /*
         I.   public static void main(String[] args) { // java.lang.ArithmeticException: / by zero
         II.  public static void main(String[] args) throws Exception { // java.lang.ArithmeticException: / by zero
         III. public static void main(String[] args) throws IOException { // need Import java.io.*
         IV.  public static void main(String[] args) throws RuntimeException { // java.lang.ArithmeticException: / by zero

         */
        int x = 0;
        System.out.println(7/x); //throws error
    }
}