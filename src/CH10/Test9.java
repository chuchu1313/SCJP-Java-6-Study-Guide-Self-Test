package CH10;



public class Test9{
    public static void main(String[] args){

    }
}
/*
A. java FindBaz // Wrong! Cannot findtest/Baz.class
B. java -classpath test FindBaz // Wrong! Cannot find test/Baz.class and FindBaz.java
C. java -classpath .:test FindBaz // Correct! Can find FindBaz.java and test/Baz.class
D. java -classpath .:test/myApp FindBaz // Wrong! Can find FindBaz.java but will find myApp/Baz first
E. java -classpath test:test/myApp FindBaz // Wrong! Can find test/Baz.class but cannot find FindBaz.java
F. java -classpath test:test/myApp:. FindBaz // Correct!
G. java -classpath test/myApp:test:. FindBaz // Wrong! Will find myApp/Baz first
 */