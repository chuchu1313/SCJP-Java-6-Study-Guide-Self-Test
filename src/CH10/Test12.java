package CH10;

public class Test12 {
}

/*
x
|
GoDeep.class
test
   |
   MyJar.jar
   myApp
       |
       Foo.java
       Foo.class



A. java GoDeep // Wrong! Cannot find Foo.class
B. java -classpath . GoDeep // Wrong! Cannot find Foo.class
C. java -classpath test/MyJar.jar GoDeep // Wrong! Cannot find GoDeep.class
D. java GoDeep -classpath test/MyJar.jar //Wrong
E. java GoDeep -classpath test/MyJar.jar:.  //Wrong
F. java -classpath .:test/MyJar.jar GoDeep //Correct!
G. java -classpath test/MyJar.jar:. GoDeep //Correct!
 */