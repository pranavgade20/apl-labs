package week4._5;

public class PublicClass1 {
    static void hello() {
        System.out.println("Hello from PublicClass1");
    }
    static void privateHello() {
        PrivateClass.hello();
    }

    private class PrivateClass {
        static void hello() {
            System.out.println("Hello from PrivateClass");
        }
    }
}
