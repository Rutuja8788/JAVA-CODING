package rutuja;
import java.util.*;

class MapEX {
    public static void main(String args[])
    {
        Map<String, Integer> hm = new HashMap<>();

        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);
        for (Map.Entry<String, Integer> entry : hm.entrySet()) //we cannot iterate map using forloop because map is not interble Collection
        {
            System.out.print(entry.getKey() + ":");
            System.out.println(entry.getValue());
        }
    }
}
