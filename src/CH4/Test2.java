package CH4;

class Comp2{
    public static void main(String[] args){
        float f1 = 2.3f;
        float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
        float[] f3 = {2.7f};
        Long x = 42L;
        /*
         F1.  if(f1 == f2) // Compile error!
         F2.  if(f1 == f2[2][1]) // Compile ok but false, 2.3f != 2.7f
         F3.  if(x == f2[0][0]) // Compile ok, correct!
         F4.  if(f1 == f2[1,1]) // Compile error. f2[1,1] is written wrong.
         F5.  if(f3 == f2[2]) // Compile ok! float[] != float[][]

         */
            System.out.println("true");
    }
}
