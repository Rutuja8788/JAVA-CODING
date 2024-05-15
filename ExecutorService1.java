import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private int taskId;

    public Task(int id) {
        this.taskId = id;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is executing by " + Thread.currentThread().getName());

    }
}

public class ExecutorService1
{
    public static void main(String[] args)
    {

        ExecutorService executor = Executors.newFixedThreadPool(5);


        for (int i = 0; i < 10; i++)
        {
            Task task = new Task(i);
            executor.submit(task);
        }

        // Shutdown the executor once all tasks are completed
        executor.shutdown();
    }
}

