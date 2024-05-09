package rutuja;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class MethodStream
{

    public static void main(String[] args)
    {
        // count,distinct,limit

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 7, 8, 9, 5);

        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct numbers: " + distinctNumbers);


        List<Integer> limitedNumbers = numbers.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("Limited numbers: " + limitedNumbers);


        long count = numbers.stream()
                .count();
        System.out.println("Total count: " + count);
    }
}
