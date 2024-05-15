import threding.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2
{
    public static void main(String[] args)
    {
        ThreadingEX methods = new ThreadingEX();
        Syncro synchro= new Syncro();


        methods.start();
        synchro.start();
        methods.printNumbers();
        methods.printCharacters();
        synchro.printNumbers();


        synchro.printCharacters();
        ExecutorService executor = Executors.newFixedThreadPool(3);


        for (int i = 0; i < 5; i++) {
            ThreadPoolEX task = new ThreadPoolEX(i);
            executor.submit(task);
        }

        executor.shutdown();
    }
}
