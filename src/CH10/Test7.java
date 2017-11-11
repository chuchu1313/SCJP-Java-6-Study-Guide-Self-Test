package CH10;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String args[]) {
        List<String> myList = new ArrayList<String>(); //Generic type only available after Java 1.5
        assert (args.length > 0); //Only available before Java 1.4, default is disable
        System.out.println("still static");
    }
}

/*
A. javac Test7.java // Correct!
   java Test7
B. javac Test7.java
   java -ea Test7 // Wrong! cause assertionError
C. javac -source 6 Test7.java // Correct!
   java Test7
D. javac -source 1.4 Test7.java // Wrong! generics are not supported in -source 1.4
   java Test7
E. javac -source 1.6 Test7.java
   java -ea Test7 // Wrong! cause assertionError
 */
