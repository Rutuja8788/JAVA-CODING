package rutuja;
import java.util.*;

// Main class
public class TreeMapEx {


    public static void main(String[] args)
    {


        Map<Integer,String> map = new TreeMap<>();

        map.put(10,"rutu");
        map.put(2,null);
        map.put(20,"saurabh");


        for (Map.Entry<Integer,String > e : map.entrySet())


            System.out.println(e.getKey() + " "+ e.getValue());
    }
}