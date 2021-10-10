package week6._7;

import java.io.File;
import java.io.IOException;

public class Main {
    //Write a java program that demonstrates the use of java runtime class to following operations
    //1) Open notepad
    //2) Create a new file called mythread.java
    //Also, implement demonstrate garbage collection in java. (Hint: think of differencing and
    //finalize() method);
    public static void main(String[] args) {
        try {
            System.out.println("starting vim");
            var ps = Runtime.getRuntime().exec("/usr/bin/vim");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("creating file mythread.java");
            new File("mythread.java").createNewFile();
            System.out.println("file created");
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Object() {
            @Override
            protected void finalize() throws Throwable {
                System.out.println("finalize called");
                super.finalize();
            }
        };

        System.gc();
    }
}
