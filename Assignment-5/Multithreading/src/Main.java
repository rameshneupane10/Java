public class Main {
    public static void main(String[] args)
    {
        Counter counter = new Counter();

        Process1 p1 = new Process1(counter);
        Process2 p2 = new Process2(counter);

        Thread th1 = new Thread(p1);
        Thread th2 = new Thread(p2);

        th1.start();
        th2.start();

    }
}
class Process1 implements Runnable
{
   Counter counter;
    public Process1(Counter counter)
    {
        this.counter = counter;
    }

    @Override
    public void run()
    {
        int i = 0;
        while (i < 1000)
        {
            synchronized (counter)
            {
                counter.increment();
            }
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class Process2 implements Runnable
{
    private Counter counter;

    public Process2(Counter counter)
    {
        this.counter = counter;
    }

    @Override
    public void run()
    {
        int i = 0;
        while (i < 1000) {
            synchronized (counter)
            {
                counter.increment();
            }
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

