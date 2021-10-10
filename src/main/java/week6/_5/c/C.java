package week6._5.c;

public class C extends Thread{
    public C(ThreadGroup group, Runnable target) {
        super(group, target);
    }

    @Override
    public void run() {
        System.out.println("C is running");
    }
}
