package week6._1;

public class Main {
    //Create Java program demonstrating thread states. Create three threads and name them as
    //sachin, virat and sehwag. Using java.lang.Thread.class demonstrate life cycle of the thread, i.e.
    //1) New 2) Active 3) Runnable 4) Running 5) Blocked/Waiting.
    public static void main(String[] args) throws InterruptedException {
        var sachin = new Thread(() -> { });
        System.out.println("Status of sachin thread: " + sachin.getState().name());
        sachin.start();

        var virat = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {}
        });
        virat.start();
        System.out.println("Status of virat thread: " + virat.getState().name());
        var sehwag = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {
                }
            }
        });
        sehwag.start();
        Thread.sleep(10);
        System.out.println("Status of virat thread: " + sehwag.getState().name());

        System.out.println("Status of sachin thread: " + sachin.getState().name());
    }
}
