
import java.util.*;
public class StackEx {


    public static void main(String args[])
    {
        Stack<String> stack = new Stack<>();
        stack.push("Geeks");
        stack.push("For");
        stack.push("Rutuja");
        stack.push("Geeks");

        Iterator<String> itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        itr = stack.iterator();

        while (itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
    }
}
