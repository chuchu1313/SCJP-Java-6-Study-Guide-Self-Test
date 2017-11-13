package CH6;

import java.io.*;
public class Test5 {
    public static void main(String[] args){
        try {
            File dir = new File("dir3");
            dir.mkdir();
            File file = new File(dir, "file3");
            file.createNewFile();
        }catch (Exception x){}
    }
}
