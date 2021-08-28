package week4._5;

/*
5. Create a package that consists of two public classes and one private class. Now create another main
class that can access the methods of the package using the fully qualified name concept of the package
and the import package.classname concept. In that case, write two separate java programs to show how
fully qualified name concept of the package and the import package.classname concept works in java
programming.
 */
public class Main_2 {
    public static void main(String[] args) {
        PublicClass1.hello();
        PublicClass1.privateHello();
        PublicClass2.hello();

    }
}
