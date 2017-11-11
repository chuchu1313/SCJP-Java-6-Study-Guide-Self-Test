package CH10;

import java.util.Properties;

public class Test8 {
    public static void main(String[] args) {
        Properties p = System.getProperties();
        p.setProperty("myProp", "myValue");
        System.out.print(p.getProperty("cmdProp") + " "); // cmdValue
        System.out.print(p.getProperty("myProp") + " "); // myValue
        System.out.print(p.getProperty("noProp") + " "); // null
        p.setProperty("cmdProp", "newValue");
        System.out.println(p.get("cmdProp")); // newValue
    }
}
