
import java.util.*;
        import java.util.concurrent.LinkedBlockingQueue;

public class StringBuilder2 {
    public static void main(String[] argv)
            throws Exception
    {
        StringBuilder str
                = new StringBuilder("AAAABBBCCCC");

        // print string
        System.out.println("String = "
                + str.toString());

        // reverse the string
        StringBuilder reverseStr = str.reverse();


        System.out.println("Reverse String = "
                + reverseStr.toString());

        str.append("rutu");

        // Print the modified String
        System.out.println("Modified StringBuilder = "
                + str.toString());

        // get capacity
        int capacity = str.capacity();

        // print the result
        System.out.println("StringBuilder = " + str);
        System.out.println("Capacity of StringBuilder = "
                + capacity);
    }
}