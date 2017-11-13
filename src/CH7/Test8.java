package CH7;

import java.util.List;

public class Test8<E>{
    public static <E extends Number> List<E> process(List<E> nums){
        return nums;
    }
    public static void main(String[] args){
        /*
        A. ArrayList<Integer> input = null;
           ArrayList<Integer> output = null; // Return base type should be List
        B. ArrayList<Integer> input = null; // Correct
           List<Integer> output = null;
        C. ArrayList<Integer> input = null;
           List<Number> output = null; // Generic type should be the same
        D. List<Number> input = null;
           ArrayList<Integer> output = null; // Generic type should be the same
        E. List<Number> input = null; // Correct
           List<Number> output = null;
        F. List<Integer> input = null; // Correct
           List<Integer> output = null;
         */
        /*List<E extends Number> input = new List<E extends Number>;
        List<E extends Number> = process(input);*/
    }
}
