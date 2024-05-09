import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Filter2
{
    public static void main(String s[])
    {
        List<String>s1=Arrays.asList("rutu","pawase","saurabh","shivam");
        List<String>s2=new ArrayList<>();
        s2=s1.stream().filter(str->str.length()>2 && str.length()<6).collect(Collectors.toList());
        System.out.println(s2);
    }
}
