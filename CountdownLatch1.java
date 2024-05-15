
import java.util.concurrent.CountDownLatch;

public class CountdownLatch1
{
    public static void main(String[] s) throws InterruptedException
    {
        final int NUM_THREADS = 3;
        CountDownLatch latch = new CountDownLatch(NUM_THREADS);

        for (int i = 0; i < NUM_THREADS; i++)
        {
            Thread thread = new Thread(() ->
            {
                System.out.println(Thread.currentThread().getName() + " has completed its task.");
                latch.countDown();
            });
            thread.start();
        }

        latch.await();

        System.out.println("All tasks have completed.");
    }
}
