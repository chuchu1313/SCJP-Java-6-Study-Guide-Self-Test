package CH7;

import java.util.ArrayList;

class Business{}
class Hotel extends Business{}
class Inn extends Hotel {}
class Travel{
    ArrayList<Hotel> go(){
        return new ArrayList<Hotel>(); //The return type of generic must be the same
    }
}