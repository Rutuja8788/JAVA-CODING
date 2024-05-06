
import java.util.*;

class PriorityEx{

    // Main Method
    public static void main(String args[])
    {
        PriorityQueue<Integer> pQueue
                = new PriorityQueue<>();

        pQueue.add(30);
        pQueue.add(20);
        pQueue.add(15);

        System.out.println(pQueue.peek());

        System.out.println(pQueue.poll());

        System.out.println(pQueue.peek());
    }
}
