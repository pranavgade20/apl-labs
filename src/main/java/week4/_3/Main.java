package week4._3;

import week4._3.pkg.*;
/*
3. Create a package that consists of three public classes, one private and one protected class, and an
interface. Each of the classes consists of at least two methods (set access specifiers of the methods as per
your convenience) and the interface consists of three Abstract classes. Now create a main class that
imports the above-mentioned package and displayed the functionality/results of the methods, which you
have created.
 */
public class Main {
    public static void main(String[] args) {
        PublicClass1.hello();
        PublicClass2.hello();
        PublicClass3.hello();
        PackageClass.hello();
        Interface.hello();
        Interface.AbstractClass1.hello();
        Interface.AbstractClass2.hello();
        Interface.AbstractClass3.hello();
        Interface.AbstractClass1.bye();
        Interface.AbstractClass2.bye();
        Interface.AbstractClass3.bye();
        Interface.bye();
        PackageClass.bye();
        PublicClass1.bye();
        PublicClass2.bye();
        PublicClass3.bye();
    }
}
