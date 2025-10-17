class Add implements Runnable {
    int num1, num2;

    Add(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public synchronized void addition() {
        int add = num1 + num2;
        System.out.println("Addition: " + add);
    }

    public void run() {
        this.addition();
    }
}

class Sub implements Runnable {
    int num1, num2;

    Sub(int a, int b) {
        num1 = a;
        num2 = b;
    }

    public synchronized void subtraction() {
        int sub = num1 - num2;
        System.out.println("Subtraction: " + sub);
    }

    public void run() {
        this.subtraction();
    }
}

public class Multithreading {
    public static void main(String[] args) {
        System.out.println("Monisha // 2024503043");

        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t);
        t.setName("Main Thread");
        System.out.println("Thread name: " + t.getName());

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        Add obj1 = new Add(5, 3);
        Sub obj2 = new Sub(6, 9);

        double starttime = System.currentTimeMillis();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        double endtime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endtime - starttime) + " ms");
    }
}