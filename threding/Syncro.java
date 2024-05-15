package threding;
public class Syncro  extends Thread{

    public synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Printing number (synchronized1): " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public synchronized void printCharacters() {
        for (char ch = 'a'; ch <= 'e'; ch++) {
            System.out.println("Printing character (synchronized1): " + ch);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}