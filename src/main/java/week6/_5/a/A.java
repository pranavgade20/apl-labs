package week6._5.a;

public class A extends Thread{
    public A(ThreadGroup group, Runnable target) {
        super(group, target);
    }

    @Override
    public void run() {
        System.out.println("A is running");
    }
}
