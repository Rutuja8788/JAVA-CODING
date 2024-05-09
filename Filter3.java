import java.util.*;
import java.util.stream.Collectors;
public class Filter3
{
    //remove null value
    public static void main(String s[])
    {
        List<String>s1=Arrays.asList("rutu",null,"pawase",null);
        List<String>s2=new ArrayList<>();
        s2=s1.stream().filter(str->str!=null).collect(Collectors.toList());
        System.out.println(s2);
    }
}
