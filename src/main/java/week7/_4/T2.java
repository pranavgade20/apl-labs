package week7._4;

public class T2 extends Thread{
    public Object obj;

    public T2(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println("T2 waiting for notification");
                synchronized (obj) {
                    obj.wait();
                }
                System.out.println("T2 received notification");
            }
        } catch (InterruptedException e) {
            System.out.println("T2 interrupted");
        }
    }
}
