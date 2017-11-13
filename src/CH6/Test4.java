package CH6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Keyboard{}
class Computer implements Serializable{
    private Keyboard k = new Keyboard();
    public static void main(String[] args){
        Computer c = new Computer();
        c.storeIt(c);
    }
    void storeIt(Computer c){
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("myFiles"));
            os.writeObject(c);
            os.close();
            System.out.println("done");
        }catch (Exception e){
            System.out.println("exc"); //Keyboard should implements Serializable //java.io.NotSerializableException: CH6.Keyboard
        }
    }
}
