package CH6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Archie{
    public static void main(String[] args){
        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);
        int count = 0;
        while(m.find())
            count++;
        System.out.print(count);
    }
}
//java Archie "\d+" ab2c4d67
/*
2, 2
4, 4
6, 67
 */
