package CH7;

import java.util.HashMap;
import java.util.Map;

class MapEQ{
    public static void main(String[] args){
        Map<ToDos, String> m = new HashMap<ToDos, String>();
        ToDos t1 = new ToDos("Monday");
        ToDos t2 = new ToDos("Monday");
        ToDos t3 = new ToDos("Tuesday");
        m.put(t1, "doLaundry");
        m.put(t2, "payBills");
        m.put(t3, "cleanAttic");
        System.out.println(m.size());


    }
}
class ToDos{
    String days;
    ToDos(String d){
        days = d;
    }

    @Override
    public boolean equals(Object obj) {
        return ((ToDos)obj).days == this.days;
    }
//    public int hashCode(){return 9;} //if implement this, will output 2, because t2 will replace t1 (A bucket can only put unique key)
}

