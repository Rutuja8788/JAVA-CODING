package rutuja;
import java.util.*;

// Main class
public class LinkedHashMap1 // insertion order follow
{

    // Main driver method
    public static void main(String[] args)
    {


        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("Rutu", 10);
        map.put(null, null);
        map.put("pawase", 20);


        for (Map.Entry<String, Integer> e : map.entrySet())


            System.out.println(e.getKey() + " " + e.getValue());
    }
}