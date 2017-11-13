package CH6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);
        boolean b = false;
        while (b = m.find()) {
            System.out.print(m.start() + m.group());
        }
    }
}
//java Regex2 "\d*" ab34ef
// \d*:0~n digits place7 does not have any integers, so output has 7