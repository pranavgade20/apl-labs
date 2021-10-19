package week7._4;

public class Main {
    //Inter-thread communication or Co-operation is all about allowing synchronized threads to
    //communicate with each other.
    //Write a java program using three threads t1, t2 and t3 using Thread classes in separate files.
    //Make use of them in your main class. Using the demonstrate the working of
    //1)wait()
    //2)notify()
    //3)notifyAll()
    public static void main(String[] args) {
        Object obj = new Object();
        var t1 = new T1(obj);
        var t2 = new T2(obj);
        var t3 = new T3(obj);

        t1.start();
        t2.start();
        t3.start();

        try {
            t3.join(); // waiting for t3 to finish
            Thread.sleep(10);
            t1.interrupt();
            t2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
