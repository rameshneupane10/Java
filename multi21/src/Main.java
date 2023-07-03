import java.lang.Process;
public class Main {
    public static void main(String[] args)
    {
        Process1 p1 = new Process1();
        Process2 p2 = new Process2();

        Thread th1 = new Thread(p1);
        Thread th2 = new Thread(p2);

        th1.start();
        th2.start();
    }
}

class Process1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("ACE");
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Process2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("east blue");
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
