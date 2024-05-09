package rutuja;

 import java.util.Arrays;
import java.util.List;
import java.util.Optional;

 public class StreamMethod1
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7, 3, 8);
        Optional<Integer> minValue = numbers.stream()
                .min(Integer::compareTo);
        System.out.println("Minimum value: " + minValue);

        Optional<Integer> maxValue = numbers.stream()
                .max(Integer::compareTo);
        System.out.println("Maximum value: " + maxValue);


        Integer[] array = numbers.stream()
                .toArray(Integer[]::new);
        System.out.println("Array: " + Arrays.toString(array));
    }
}


