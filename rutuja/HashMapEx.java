package rutuja;
import java.util.*;

// Main class
public class HashMapEx
{

    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("Rutuja", 10);
        map.put("Pawase", 30);
        map.put("saurabh", 20);


        for (Map.Entry<String, Integer> e : map.entrySet())

        {
            System.out.println(e.getKey() + " "
                    + e.getValue());
        }
    }
}
