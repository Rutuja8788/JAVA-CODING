package threding;
public class ThreadPoolEX implements Runnable
{
    private final int taskId;

    public ThreadPoolEX(int id)
    {
        this.taskId = id;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " starting");
        try
        {

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task " + taskId + " finished");
    }
}