public class Threadclass {
    public static void main(String[] args) {
        

        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t);

        t.setName("Main Thread");
        System.out.println("Thread name: " + t);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000); // sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}