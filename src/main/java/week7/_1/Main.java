package week7._1;

public class Main {
    //”Synchronization in Java is the capability to control the access of multiple threads to any
    //shared resource.”
    //Write a java program demonstrating thread synchronization using
    //1)Synchronization method
    //2)Synchronization block
    Integer i = 0;
    synchronized int count1() {
        i += 1;
        return i;
    }

    int count2 () {
        synchronized (i) {
            i += 1;
        }
        return i;
    }

    public static void main(String[] args) {
        var obj = new Main();
        Thread a = new Thread(() -> System.out.println(obj.count1()));
        Thread b = new Thread(() -> System.out.println(obj.count1()));
        Thread c = new Thread(() -> System.out.println(obj.count2()));
        Thread d = new Thread(() -> System.out.println(obj.count2()));

        try {
            a.start();
            Thread.sleep(20);
            b.start();
            Thread.sleep(20);
            c.start();
            Thread.sleep(20);
            d.start();
            a.join();
            b.join();
            c.join();
            d.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
