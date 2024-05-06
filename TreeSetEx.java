
import java.util.*;

public class TreeSetEx {

    // Main Method
    public static void main(String args[])
    {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(4);
        ts.add(6);
        ts.add(3);
        ts.add(9);

        Iterator<Integer> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
