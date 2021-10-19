package week7._4;

public class T3 extends Thread{
    public Object obj;

    public T3(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        try {
            System.out.println("notifying one thread:");
            Thread.sleep(10);
            synchronized (obj) {
                obj.notify();
            }
            System.out.println("notifying all threads:");
            Thread.sleep(20);
            synchronized (obj) {
                obj.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
