package CH10;


public class Test3 {
    /*
    foo
      |
       test
          |
          xcom
              |--A.class
              |--B.java

     Compiler needs to find B.java at first, then find needed class(int this case is xcom/A.class) in the classpath
     A. In xcom call 'javac B.java' - Wrong, in default classpath cannot find xcom/A.class
     B. In xcom call 'javac -classpath . B.java' - Wrong, in xcom xcom/A.class
     C. In test folder call 'javac -classpath . xcom/B.java - ok, because  xcom/A.class is found in test subfolder
     D. In test folder call 'javac -classpath xcom B.java' - Wrong. Should be xcom/B.java
     E. In test folder call 'javac -classpath xcom:. B.java' - Wrong. Should be B.java. Must be xcom/B.java
    */
}
