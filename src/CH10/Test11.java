package CH10;

public class Test11 {
}

/*
test
    |
     GetJar.java
     MyApp (MyJar.jar)
          |
          Foo.java

A. javac -classpath MyJar.jar GetJar.java
   javac -classpath MyJar.jar:. GetJar
B. javac MyJar.jar GetJar.java // Wrong! needs -classpath
   java GetJar
C. javac -classpath MyJar.jar GetJar.java
   java -classpath MyJar.jar GetJar  // Wrong! needs -classpath .dot to find GetJar.java
D. javac MyJar.jar GetJar.java // Wrong! needs -classpath
   java -classpath MyJar.jar GetJar
 */
