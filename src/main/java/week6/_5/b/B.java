package week6._5.b;

public class B extends Thread{
    public B(ThreadGroup group, Runnable target) {
        super(group, target);
    }

    @Override
    public void run() {
        System.out.println("B is running");
    }
}
