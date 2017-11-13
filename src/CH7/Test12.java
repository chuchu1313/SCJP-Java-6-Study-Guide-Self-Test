package CH7;

import java.util.Iterator;
import java.util.TreeSet;

public class Test12 {
    public static void main(String[] args){
        TreeSet<String> s = new TreeSet<String>();
        TreeSet<String> subs = new TreeSet<String>();
        s.add("b");
        s.add("a");
        s.add("c");
        s.add("e");
        s.add("d");

        subs = (TreeSet)s.subSet("b", true, "d", true);
        //  s = {"a", "b", "c", "d", "e"}
        //subs= {     "b", "c", "d"}
        s.add("g");
        s.pollFirst();
        s.pollFirst();
        s.add("c2");
        System.out.println(s.size() + " " + subs.size());
        Iterator i = s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        //  s = {"c", "c2", "d", "e", "g"}
        //subs= {"c", "c2", "d"}

    }
}
