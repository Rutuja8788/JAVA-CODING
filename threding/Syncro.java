package threding;
public class Syncro  extends Thread{

    public synchronized void printNumbersSynchronized() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Printing number (synchronized): " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public synchronized void printCharactersSynchronized() {
        for (char ch = 'a'; ch <= 'e'; ch++) {
            System.out.println("Printing character (synchronized): " + ch);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}