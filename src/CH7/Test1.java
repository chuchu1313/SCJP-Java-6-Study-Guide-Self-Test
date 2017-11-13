package CH7;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args){
        // List<List<Integer>> table = new List<List<Integer>>(); // Wrong, cannot new an interface
         List<List<Integer>> table = new ArrayList<List<Integer>>(); // Wrong, object generic type should be ArrayList<Integer>
        // (left and right generic type must be the same)
        //List<List<Integer>> table = new ArrayList<ArrayList<Integer>>(); // Ok
        // List<List, Integer> table = new List<List, Integer>(); // Wrong! Declaration is incorrect
        // List<List, Integer> table = new ArrayList<List, Integer>(); // Wrong! Declaration is incorrect
        // List<List, Integer> table = new ArrayList<ArrayList, Integer>(); // Wrong! Declaration is incorrect
        for(int i = 0; i <= 10; i++){
            List<Integer> row  = new ArrayList<Integer>();
            for(int j = 0; j <= 10; j++){
                row.add(i*j);
            }
            table.add(row);
        }
        for(List<Integer> row : table){
            System.out.println(row);
        }
    }
}
