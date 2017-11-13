package CH6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadingFor{
    public static void main(String[] args){
        String s;
        try{
            FileReader fr = new FileReader("myfile.txt");
            BufferedReader br = new BufferedReader(fr);
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
            // br.flush(); // only should call when use Writer
        }catch (IOException e){
            System.out.println("io error");
        }
    }
}