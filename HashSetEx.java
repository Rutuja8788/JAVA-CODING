import java.util.*;

public class HashSetEx {


    public static void main(String args[])
    {
        HashSet<String> hs = new HashSet<>();

        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
