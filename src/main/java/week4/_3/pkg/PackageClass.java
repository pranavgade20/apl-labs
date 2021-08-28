package week4._3.pkg;

public class PackageClass {
    private class PrivateClass {
        public static void hello() {
            System.out.println("Hello from PrivateClass");
        }
        public static void bye() {
            System.out.println("Bye from PrivateClass");
        }
    }
    protected class ProtectedClass {
        public static void hello() {
            System.out.println("Hello from ProtectedClass");
        }
        public static void bye() {
            System.out.println("Bye from ProtectedClass");
        }
    }

    public static void hello() {
        System.out.println("Calling PackagePrivateClass.hello from here because it cannot be accessed from outside:");
        PackagePrivateClass.hello();
        System.out.println("Calling PrivateClass.hello from here because it cannot be accessed from outside:");
        PrivateClass.hello();
        System.out.println("Calling ProtectedClass.hello from here because it cannot be accessed from outside:");
        ProtectedClass.hello();
    }
    public static void bye() {
        System.out.println("Calling PackagePrivateClass.bye from here because it cannot be accessed from outside:");
        PackagePrivateClass.bye();
        System.out.println("Calling PrivateClass.bye here because it cannot be accessed from outside:");
        PrivateClass.bye();
        System.out.println("Calling ProtectedClass.bye here because it cannot be accessed from outside:");
        ProtectedClass.bye();
    }
}

class PackagePrivateClass {
    public static void hello() {
        System.out.println("Hello from PackagePrivateClass");
    }

    public static void bye() {
        System.out.println("Bye from PackagePrivateClass");
    }
}
