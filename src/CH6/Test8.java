package CH6;

import java.io.*;

class TestSer{
    public static void main(String[] args){
        SpecialSerial s = new SpecialSerial();
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("myFile"));
            os.writeObject(s); //s1.y ==7, s1.z == 9
            os.close();

            ObjectInputStream is = new ObjectInputStream(new FileInputStream("myFile"));
            SpecialSerial s2 = (SpecialSerial)is.readObject();
            is.close();
            System.out.println(s2.y + " " + s2.z); // s2.y == 0, s2.z == 10(because static memory only has one)
        }catch (Exception e){
            System.out.println("exc");
        }
    }
}
class SpecialSerial implements Serializable{
    transient int y = 7;
    static int z = 9;
}
