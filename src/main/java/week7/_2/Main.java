package week7._2;

public class Main {
    //Write a java program to demonstrate the use of static synchronized method. Create a 3
    //threads say t1, t2 and t3 respectively and make use of static synchronization.
    static Integer i = 0;
    static synchronized int count() {
        i += 1;
        return i;
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println(count()));
        Thread t2 = new Thread(() -> System.out.println(count()));
        Thread t3 = new Thread(() -> System.out.println(count()));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
