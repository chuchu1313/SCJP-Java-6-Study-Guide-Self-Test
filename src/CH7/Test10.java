package CH7;

import java.util.*;

class Mixup{
    public static void main(String[] args){
        Object o = new Object();

        //Set s = new HashSet(); // Ok
        TreeSet s = new TreeSet(); // When runtime doing comparator will cause exception
        // LinkedHashSet s = new LinkedHashSet(); // Ok

        s.add("o");
        s.add(o);
    }
}