package CH7;

import java.util.*;

class Turtle{
    int size;
    public Turtle(int s) {
        size = s;
    }
    public boolean equals(Object o){
        return (this.size == ((Turtle)o).size);
    }

    @Override
    public int hashCode() { //If override hashcode, size will only outputs 2; otherwise is 3
        return size/5;
    }
}
class TurtleTest{
    public static void main(String[] args){
        LinkedHashSet<Turtle> t = new LinkedHashSet<Turtle>();
        t.add(new Turtle(1));
        t.add(new Turtle(2));
        t.add(new Turtle(1));
        System.out.println(t.size());
    }
}
