import java.util.*;

public class xyz {
    public static void main(String[] args) {
        List<Integer> s1 = Arrays.asList(2, 5, 7, 8, 9);
        List<Integer> s2 = new ArrayList<>();

        for (int n : s1)
        {
            if (n % 2 == 0) {
                s2.add(n);
            }
        }

        System.out.println(s2);
    }
}
