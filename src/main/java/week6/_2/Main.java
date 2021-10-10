package week6._2;

public class Main {
    //Create Java program that implements 3 threads using Thread class. Name them as Sania,
    //Maria, Serena. Give them different priority and demonstrate the use of following methods:
    //1) run()
    //2) start()
    //3) sleep() -Sania sleeps for 100ms,Maria for 200ms,Serena for 300ms
    //4) join()
    //5) getpriority()
    //6) yield()
    //7) suspend
    //8) Resume
    public static void main(String[] args) throws InterruptedException {
        var sania = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("calling sleep()");
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        };
        sania.setPriority(Thread.MIN_PRIORITY);
        var maria = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                    System.out.println("calling yield()");
                    Thread.yield();
                } catch (InterruptedException e) {
                }
            }
        };
        maria.setPriority(Thread.NORM_PRIORITY);
        var serena = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                }
            }
        };
        serena.setPriority(Thread.MAX_PRIORITY);
        System.out.println("calling run()");
        sania.run();
        System.out.println("calling start()");
        maria.start();
        System.out.println("calling join()");
        maria.join();
        serena.start();
        System.out.println("calling getPriority(): " + serena.getPriority());
        System.out.println("calling suspend()");
        serena.suspend();
        System.out.println("calling resume()");
        serena.resume();
    }
}
