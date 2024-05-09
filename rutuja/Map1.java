package rutuja;
import java.util.*;

import java.util.stream.Collectors;

public class Map1
{
    public static void main(String s[])
    {
        List<String>s1=Arrays.asList("rutuja","pawase","masnsi");
        List<String>s2=new ArrayList<>();
        /*using enhanced loop
        for(String str:s1) {
            s2.add(str.toUpperCase());
        }
        System.out.println(s2);
        */
        //using stream api
        s2=s1.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(s2);
    }
}
