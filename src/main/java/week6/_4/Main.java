package week6._4;

public class Main {
    //“Daemon Thread are threads who sole purpose is to serve other threads. When it is no longer
    //serving anyone it dies.”
    //Create a java program that implements 3 threads. Make one of them as daemon thread and
    //demonstrate the truth of the above statement.
    public static void main(String[] args) {
        var a = new Thread(() -> {
            System.out.println("thread a");
        });
        var b = new Thread(() -> {
            System.out.println("thread b");
        });
        var c = new Thread(new Runnable() {
            @Override
            public void run() {
                a.start();
                b.start();
                try {
                    a.join();
                    b.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void finalize() throws Throwable {
                System.out.println("Daemon thread is killed");
                super.finalize();
            }
        });
        c.setDaemon(true);

        c.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.gc();
    }
}
