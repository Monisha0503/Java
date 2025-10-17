public class LambdaMethod {
    public static void main(String[] args) {
        // Current thread example
        
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t);
        t.setName("Main Thread");
        System.out.println("Thread name: " + t);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000); // Sleep 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Lambda thread
        Thread t1 = new Thread(() -> {
            System.out.println("Printing thread1 using lambda method.");
        });

        // Anonymous class thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread2 using anonymous Runnable.");
            }
        });

        t1.start();
        t2.start();
    }
}