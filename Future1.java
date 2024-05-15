
import java.util.concurrent.*;

public class Future1
{
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        Callable<Integer> task = () -> {System.out.println("Task is running...");
            Thread.sleep(2000);
            return 42;
        };

        Future<Integer> future = executor.submit(task);

        System.out.println("Main thread is doing something else...");

        try
        {
            Integer result = future.get();
            System.out.println("Task returned: " + result);
        }
        catch (InterruptedException | ExecutionException e)
        {;
        }

        executor.shutdown();
    }
}
