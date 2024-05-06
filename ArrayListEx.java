
import java .util.*;
public class ArrayListEx
{
    public static void main(String s[])
    {
        ArrayList<Integer>s1=new ArrayList<>();
        for(int i=1;i<=5;i++)
        {
            s1.add(i);
        }
        System.out.println(s1);
        s1.remove(3);
        System.out.println(s1);
        for(int i=0;i<s1.size();i++)
        {
            System.out.println(s1.get(i));
        }
        System.out.println(s1);
    }
}
