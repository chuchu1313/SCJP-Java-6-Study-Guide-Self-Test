package CH7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test3 {
    public static void main(String[] args){
        Set set = new TreeSet(); //Cannot add string and int to the same TreeSet, but HashSet is ok.
        set.add("2");
        set.add(3); //TreeSet is trying do sort, so ClassCastException shows
        set.add("1");
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
