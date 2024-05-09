import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter1 {
    public static void main(String s[]) {


        List<Integer> s1 = new ArrayList<>();//   ArrayList<Integer>s1=Array.asList(32,22,3,5,6,);
        List<Integer> s2 = new ArrayList<>();
        s1.add(32);
        s1.add(22);
        s1.add(3);
        s1.add(2);
     /*without Stream using enhanced for
    for(int n:s1){
        if (n % 2 == 0)
        {
            s2.add(n);
        }

    }
     System.out.println(s2);*/
        //using stream API

        s2 = s1.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(s2);
    }
}