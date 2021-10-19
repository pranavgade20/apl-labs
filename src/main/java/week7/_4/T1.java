package week7._4;

public class T1 extends Thread{
    public Object obj;

    public T1(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println("T1 waiting for notification");
                synchronized (obj) {
                    obj.wait();
                }
                System.out.println("T1 received notification");
            }
        } catch (InterruptedException e) {
            System.out.println("T1 interrupted");
        }
    }
}
