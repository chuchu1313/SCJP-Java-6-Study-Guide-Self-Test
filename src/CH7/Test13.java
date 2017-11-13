package CH7;

import java.util.SortedMap;
import java.util.TreeMap;

class Magellan {
    public static void main(String[] args){
        TreeMap<String, String> myMap = new TreeMap<String, String>();

        myMap.put("f", "fig");
        myMap.put("p", "pear");
        myMap.put("a", "apple");
        myMap.put("d", "date");
        System.out.println("1st after mango: " + myMap.higherKey("f"));// a, d, f, p
        System.out.println("1st after mango: " + myMap.ceilingKey("f"));
        System.out.println("1st after mango: " + myMap.floorKey("f"));
        SortedMap<String, String> sub = new TreeMap<String, String>();
        sub = myMap.tailMap("f"); //f, p
        System.out.println("1st after mango: " + sub.firstKey());
    }
}