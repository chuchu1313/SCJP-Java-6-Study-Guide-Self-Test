package CH10;

public class Test5 {
    /*
    in the command line: java -classpath /foo/bar/baz/bing:/foo/bar MyClass
    the classpath priority is
      1. user defined from left to right
      2. system environment variable $CLASSPATH
    A. /foo/MyClass.class
    B. /foo/bar/MyClass.class
    C. /foo/bar/baz/MyClass.class //Correct!
    D. /foo/bar/baz/bing/MyClass.class
     */
}
