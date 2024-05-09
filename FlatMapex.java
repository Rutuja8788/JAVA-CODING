import java.util.*;
import java.util.stream.Collectors;

public class FlatMapex {
    public static void main(String s[]) {
        List<Integer> s1 = Arrays.asList(2, 3);
        List<Integer> s2 = Arrays.asList(7, 99);
        List<Integer> s3 = Arrays.asList(77, 87);
        List<List<Integer>> s4 = Arrays.asList(s1, s2, s3);

        ArrayList<Integer> s5 = s4.stream()
                .flatMap(list -> list.stream().map(n -> n + 10))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(s5);
    }
}
