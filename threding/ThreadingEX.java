package threding;
public class ThreadingEX extends Thread
{


    public void run()
    {
        System.out.println("Thread is running...");
    }

    public void printNumbers()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Printing number: " + i);
            try
            {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }

    public void printCharacters() {
        for (char ch = 'a'; ch <= 'e'; ch++) {
            System.out.println("Printing character: " + ch);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

