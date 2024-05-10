
package day13;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.*;
public class MethodStream
{
    public static void streammethod()
    {
        List<Integer> s1 = Arrays.asList(3, 7, 8, 6, 9, 67, 86, 2);
        long s2 = s1.stream().filter(n -> n % 2 == 0).count();
        System.out.println(s2);
        Optional<Integer> s5 = s1.stream().filter(n -> n % 2 == 0).min((n1, n2) ->
        {
            return n1.compareTo(n2);
        });
        System.out.println(s5.get());
        Optional<Integer> s6 = s1.stream().filter(n -> n % 2 == 0).max((n1, n2) ->
        {
            return n1.compareTo(n2);
        });
        System.out.println(s6.get());
        Optional<Integer> s7 = s1.stream().reduce((n1, n2) -> {
            return n1 + n2;
        });
        System.out.println(s7.get());
        List<Integer> s8 = s1.stream().sorted().collect(Collectors.toList());
        System.out.println(s8);
        List<Integer> s9 = s1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(s9);
     }
    }
