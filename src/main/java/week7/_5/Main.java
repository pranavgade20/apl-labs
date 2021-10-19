package week7._5;

public class Main {
    //The 3 methods provided by the Thread class for interrupting a thread
    //• public void interrupt()
    //• public static Boolean interrupted()
    //• public Boolean isInterrupted()
    //Write a java program that demonstrates the use of above three methods. Create four threads t1,
    //t2, t3 and t4 and demonstrate. Also, handle the exception, when interrupt is called when threads
    //when sleep() or wait() are already called on them.
    public static void main(String[] args) {
        var t1 = new Thread(() -> {
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                System.out.println("interrupted t1");
            }
        });
        var t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (this) {
                        this.wait();
                    }
                } catch (InterruptedException e) {
                    System.out.println("interrupted t2");
                }
            }
        });
        var t3 = new Thread(() -> {
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                System.out.println("interrupted returned " + Thread.interrupted());
            }
        });
        var t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (this) {
                        this.wait();
                    }
                } catch (InterruptedException e) {
                    System.out.println("interrupted returned " + Thread.interrupted());
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("interrupting t1:");
        t1.interrupt();
        System.out.println("t1.isInterrupted() returns " + t1.isInterrupted());
        System.out.println("interrupting t2:");
        t2.interrupt();
        System.out.println("interrupting t3:");
        t3.interrupt();
        System.out.println("interrupting t4:");
        t4.interrupt();
    }
}
