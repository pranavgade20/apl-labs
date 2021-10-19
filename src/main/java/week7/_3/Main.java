package week7._3;

public class Main {
    //” Deadlock in Java is a part of multithreading. Deadlock can occur in a situation when a
    //thread is waiting for an object lock, that is acquired by another thread and second thread
    //is waiting for an object lock that is acquired by first thread. “
    //Implement a java program that goes into deadlock by creating 4 threads t1, t2, t3 and t4. You
    //should make use put print statements at appropriate positions to make it evident that your
    //program has entered deadlock.

    final static Object l1 = new Object(), l2 = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                System.out.println("t1 is locking l1");
                synchronized (l1) {
                    System.out.println("waiting for t2 to lock l2, then trying to acquire it.");
                    Thread.sleep(10);
                    synchronized (l2) {
                        System.out.println("we will never reach here");
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("t1 interrupted");
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                System.out.println("t2 is locking l2");
                synchronized (l2) {
                    System.out.println("waiting for t1 to lock l1, then trying to acquire it.");
                    Thread.sleep(10);
                    synchronized (l1) {
                        System.out.println("we will never reach here");
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("t2 interrupted");
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(15);
                System.out.println("t3 trying to lock l1, this will be a deadlock as well");
                synchronized (l1) {
                    System.out.println("t3 acquired l1");
                    System.out.println("we will never reach here");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t4 = new Thread(() -> {
            try {
                Thread.sleep(15);
                System.out.println("t4 trying to lock l2, this will be a deadlock as well");
                synchronized (l2) {
                    System.out.println("t4 acquired l2");
                    System.out.println("we will never reach here");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            System.out.println("waiting to make sure threads are deadlocked");
            Thread.sleep(20);
            if (t1.isAlive()) System.out.println("t1 is in deadlock");
            if (t2.isAlive()) System.out.println("t2 is in deadlock");
            if (t3.isAlive()) System.out.println("t3 is in deadlock");
            if (t4.isAlive()) System.out.println("t4 is in deadlock");
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
