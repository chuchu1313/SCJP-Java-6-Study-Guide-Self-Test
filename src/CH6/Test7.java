package CH6;

import java.io.*;

class Directories{
    static String[] dirs = {"dir1", "dir2"};
    public static void main(String[] args){
        for(String d : dirs){
            String path = d;
            File file = new File(path, args[0]);
            System.out.print(file.exists()); // Tests whether the file or directory denoted by this abstract pathname exists.
            System.out.print(file.isFile()); // Tests whether the file denoted by this abstract pathname is a normal file.
        }
    }
}
// File.separator:
// The system-dependent default name-separator character,
// represented as a string for convenience. This string contains a single character, namely separatorChar.