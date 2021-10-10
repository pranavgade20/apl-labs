package week6._6;

public class Main {
    //“The shutdown hook can be used to perform cleanup resource or save the state when JVM
    //shuts down normally or abruptly.”
    //
    //Write a java program that demonstrates how java shutdown hook works by create 3 anonymous
    //thread classes .Create an instance of runnable and add the threads classes created earlier into
    //the shutdown hook. Demonstrate that the above statement is true.
    public static void main(String[] args) {
        var a = new Thread(() -> System.out.println("thread a is running"));
        var b = new Thread(() -> System.out.println("thread b is running"));
        var c = new Thread(() -> System.out.println("thread c is running"));
        Runtime.getRuntime().addShutdownHook(a);
        Runtime.getRuntime().addShutdownHook(b);
        Runtime.getRuntime().addShutdownHook(c);
    }
}
