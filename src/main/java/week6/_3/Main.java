package week6._3;

public class Main {
    //Implement the above program using runnable interface. Also, see what happens when you call
    //run method directly without calling start. And set equal priority to all threads. Write a program
    //that demonstrates this and print your explanation in the terminal for what is happening when you
    //call run() directly.
    public static void main(String[] args) throws InterruptedException {
        var sania = new Thread(() -> {
            try {
                System.out.println("calling sleep()");
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        });
        var maria = new Thread(() -> {
            try {
                Thread.sleep(200);
                System.out.println("calling yield()");
                Thread.yield();
            } catch (InterruptedException e) { }
        });
        var serena = new Thread(() -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) { }
        });
        sania.setPriority(Thread.MIN_PRIORITY);
        maria.setPriority(Thread.MIN_PRIORITY);
        serena.setPriority(Thread.MIN_PRIORITY);
        System.out.println("calling run()");
        System.out.println("directly invoking run() causes current the code to run in current thread, " +
                "so execution beyond this point is paused until run() returns");
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
