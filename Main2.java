import threding.*;
public class Main2
{
    public static void main(String[] args)
    {
        ThreadingEX methods = new ThreadingEX();
        Syncro synchronizedMethods = new Syncro();

        // Start threads by calling start() method
        methods.start();
        synchronizedMethods.start();
        methods.printCharacters();
        synchronizedMethods.printCharactersSynchronized();
    }
}
