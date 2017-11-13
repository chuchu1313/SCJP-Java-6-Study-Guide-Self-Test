package CH6;

import java.io.Console;

class Talker{
    public static void main(String[] args){
        Console c = System.console();
        String u = c.readLine("%s", "username: ");
        System.out.println("hello " + u);
        //String pw; // should be char[] pw
        char[] pw;
        if(c != null && (pw = c.readPassword("%s", "password: ")) != null){

        }
    }
}
